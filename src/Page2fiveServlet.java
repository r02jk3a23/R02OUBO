

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page1Servlet
 */
@WebServlet("/page2five")
public class Page2fiveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page2fiveServlet() {
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
		String[] sNum = new String[10];
		sNum[0] = request.getParameter("numa1");
		sNum[1] = request.getParameter("numb1");
		sNum[2] = request.getParameter("numa2");
		sNum[3] = request.getParameter("numb2");
		sNum[4] = request.getParameter("numa3");
		sNum[5] = request.getParameter("numb3");
		sNum[6] = request.getParameter("numa4");
		sNum[7] = request.getParameter("numb4");
		sNum[8] = request.getParameter("numa5");
		sNum[9] = request.getParameter("numb5");

		try {
			Class.forName(driverName);
			Connection connection=DriverManager.getConnection(url,id,pass);
			PreparedStatement st1 = 
					connection.prepareStatement(
							"select email from oubo where numa=? and numb=?"
						);
			st1.setString(1, sNum[0]);
			st1.setString(2, sNum[1]);
			ResultSet rs1 = st1.executeQuery();
			
			PreparedStatement st2 = 
					connection.prepareStatement(
							"select email from oubo where numa=? and numb=?"
						);
			st2.setString(1, sNum[2]);
			st2.setString(2, sNum[3]);
			ResultSet rs2 = st2.executeQuery();
			
			PreparedStatement st3 = 
					connection.prepareStatement(
							"select email from oubo where numa=? and numb=?"
						);
			st3.setString(1, sNum[4]);
			st3.setString(2, sNum[5]);
			ResultSet rs3 = st3.executeQuery();
			
			PreparedStatement st4 = 
					connection.prepareStatement(
							"select email from oubo where numa=? and numb=?"
						);
			st4.setString(1, sNum[6]);
			st4.setString(2, sNum[7]);
			ResultSet rs4 = st4.executeQuery();
			
			PreparedStatement st5 = 
					connection.prepareStatement(
							"select email from oubo where numa=? and numb=?"
						);
			st5.setString(1, sNum[8]);
			st5.setString(2, sNum[9]);
			ResultSet rs5 = st5.executeQuery();
			
			int flag = 0;
			for(int i=0;i<9;i+=2) {
				String numa = sNum[i];
				int number = Integer.parseInt(numa);
				int sum = 0;
				for(int j=0;j<7;j++) {
					sum += number%10;
					number /= 10;
				}
				if(sum%9!=0) {
					flag = 1;
				}
			}
			
			if(rs1.next()==true||rs2.next()==true||rs3.next()==true||rs4.next()==true||rs5.next()==true||flag==1) {
				request.setAttribute("flag", "error");
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/page1_5.jsp");
				rd.forward(request, response);
			}else {
			PreparedStatement st = 
					connection.prepareStatement(
							"Insert into OUBO Values(?,?,?,sysdate)"
						);
			st.setString(1, sEname);
			st.setString(2, sNum[0]);
			st.setString(3, sNum[1]);
			
			st.executeUpdate();
			
			PreparedStatement st02 = 
					connection.prepareStatement(
							"Insert into OUBO Values(?,?,?,sysdate)"
						);
			st02.setString(1, sEname);
			st02.setString(2, sNum[2]);
			st02.setString(3, sNum[3]);
			
			st02.executeUpdate();
			
			PreparedStatement st03 = 
					connection.prepareStatement(
							"Insert into OUBO Values(?,?,?,sysdate)"
						);
			st03.setString(1, sEname);
			st03.setString(2, sNum[4]);
			st03.setString(3, sNum[5]);
			
			st03.executeUpdate();
			
			PreparedStatement st04 = 
					connection.prepareStatement(
							"Insert into OUBO Values(?,?,?,sysdate)"
						);
			st04.setString(1, sEname);
			st04.setString(2, sNum[6]);
			st04.setString(3, sNum[7]);
			
			st04.executeUpdate();
			
			PreparedStatement st05 = 
					connection.prepareStatement(
							"Insert into OUBO Values(?,?,?,sysdate)"
						);
			st05.setString(1, sEname);
			st05.setString(2, sNum[8]);
			st05.setString(3, sNum[9]);
			
			st05.executeUpdate();
			
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
