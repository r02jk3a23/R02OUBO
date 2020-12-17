

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page1Servlet
 */
@WebServlet("/winner")
public class WinnerlistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WinnerlistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String driverName = "oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@192.168.54.226:1521/orcl";
		final String id = "OUBO";
		final String pass = "TOUSEN";

//		String tEmail = request.getParameter("email");
			
		try {
/*
			Class.forName(driverName);
			Connection connection=DriverManager.getConnection(url,id,pass);
			PreparedStatement st = 
					connection.prepareStatement(
							"select count(*) as total from OUBO join TOUSEN on OUBO.numa = TOUSEN.numa and OUBO.numb = TOUSEN.numb;"
						);
			ResultSet rs = st.executeQuery();
			int total = rs.getInt("total");
			String[] result = new String[total];
*/			
			Class.forName(driverName);
				Connection connection=DriverManager.getConnection(url,id,pass);
				PreparedStatement st = 
						connection.prepareStatement(
								//"select * from oubo"
								"select substr(email, 1,(instr(email, '@')-1)) as total from OUBO join TOUSEN on OUBO.numa = TOUSEN.numa and OUBO.numb = TOUSEN.numb"
							);
				ResultSet rs = st.executeQuery();
				
				List<String[]> list = new ArrayList<String[]>();
				
				while(rs.next() != false) {
		 			String[] s = new String[4];
		 			s[0]= rs.getString("total");
		 		

		 			list.add(s);
			}
				request.setAttribute("result", list);
		 		
		 		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/winnerlist.jsp");
		 		rd.forward(request, response);	
		}catch(SQLException e) {
			System.out.println("SQLException");
			response.getWriter().println("SQLException");
			e.printStackTrace();
			e.printStackTrace(response.getWriter());
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			response.getWriter().println("ClassNotFoundException");
			e.printStackTrace();
			e.printStackTrace(response.getWriter());
		}

}

}
