package controller1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao1.GestionEtudiantImp1;
import dao1.IGestionEtudiant;

/**
 * Servlet implementation class servdec
 */
public class servdec extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IGestionEtudiant ee = new GestionEtudiantImp1();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servdec() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		session.removeAttribute("u1");
		request.getRequestDispatcher("authentification.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
