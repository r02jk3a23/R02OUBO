

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page1Servlet
 */
@WebServlet("/page1_2five")
public class Page1_2fiveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page1_2fiveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("sEname", request.getParameter("email"));
		request.setAttribute("numa1", request.getParameter("numa1"));
		request.setAttribute("numb1", request.getParameter("numb1"));
		request.setAttribute("numa2", request.getParameter("numa2"));
		request.setAttribute("numb2", request.getParameter("numb2"));
		request.setAttribute("numa3", request.getParameter("numa3"));
		request.setAttribute("numb3", request.getParameter("numb3"));
		request.setAttribute("numa4", request.getParameter("numa4"));
		request.setAttribute("numb4", request.getParameter("numb4"));
		request.setAttribute("numa5", request.getParameter("numa5"));
		request.setAttribute("numb5", request.getParameter("numb5"));
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/page1_2five.jsp");
		rd.forward(request, response);
	}

}
