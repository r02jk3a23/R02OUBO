

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page1Servlet
 */
@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String driverName = "oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@192.168.54.226:1521/orcl";
		final String id = "OUBO";
		final String pass = "TOUSEN";
		
		String sEname = request.getParameter("email");
		String sNumA = request.getParameter("numa");
		String sNumB = request.getParameter("numb");

		try {
			Class.forName(driverName);
			Connection connection=DriverManager.getConnection(url,id,pass);
			PreparedStatement st1 = 
					connection.prepareStatement(
							"select email from oubo where numa=? and numb=?"
						);
			st1.setString(1, sNumA);
			st1.setString(2, sNumB);
			ResultSet rs = st1.executeQuery();
			
			String numa = sNumA;
			int number = Integer.parseInt(numa);
			int sum = 0;
			for(int i=0;i<7;i++) {
				sum += number%10;
				number /= 10;
			}
			
			if(rs.next()==true) {
				request.setAttribute("flag", "a");
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/page1.jsp");
				rd.forward(request, response);
			}else if(sum%9!=0) {
				request.setAttribute("flag", "b");
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/page1.jsp");
				rd.forward(request, response);
			}else {
			PreparedStatement st = 
					connection.prepareStatement(
							"Insert into OUBO Values(?,?,?,sysdate)"
						);
			st.setString(1, sEname);
			st.setString(2, sNumA);
			st.setString(3, sNumB);
			
			st.executeUpdate();
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/page2.jsp");
			rd.forward(request, response);
			}
			
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
