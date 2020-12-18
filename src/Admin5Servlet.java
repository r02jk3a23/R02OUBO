

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class Admin2Servlet
 */
@WebServlet("/admin5")
public class Admin5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin5Servlet() {
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
		
		try {
			Class.forName(driverName);
			Connection connection=DriverManager.getConnection(url,id,pass);
			PreparedStatement st = 
					connection.prepareStatement(
							"select email,count(email) as c from oubo group by email order by count(email) desc"
						);
			ResultSet rs = st.executeQuery();
			int i=0;
			String[] email = new String[10];
			int[] count = new int[10];
			while(rs.next()==true&&i<10) {
				email[i] = rs.getString("email");
				count[i] = rs.getInt("c");
				i+=1;
			}
			request.setAttribute("email", email);
			request.setAttribute("count", count);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/admin5.jsp");
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
