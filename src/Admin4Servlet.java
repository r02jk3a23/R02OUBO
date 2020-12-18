

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
@WebServlet("/admin4")
public class Admin4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin4Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		final String driverName = "oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@192.168.54.226:1521/orcl";
		final String id = "OUBO";
		final String pass = "TOUSEN";
		
		String sNumA = request.getParameter("numa");
		String sNumB = request.getParameter("numb");
		String syouhin = request.getParameter("syouhin");
		System.out.print(syouhin);
		
		try {
			Class.forName(driverName);
			Connection connection=DriverManager.getConnection(url,id,pass);
			PreparedStatement st = 
					connection.prepareStatement(
							"Insert into TOUSEN Values(?,?,?)"
						);
			st.setString(1, sNumA);
			st.setString(2, sNumB);
			st.setString(3, syouhin);
			
			st.executeUpdate();
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/admin4.jsp");
			rd.forward(request, response);
			
			
		}catch(SQLException e) {
			
		}catch(ClassNotFoundException e) {
			
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/admin4.jsp");
		rd.forward(request, response);
	}

}
