package controller1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao1.GestionEtudiantImp1;
import dao1.IGestionEtudiant;
import model1.etudiant;
import model1.user;

/**
 * Servlet implementation class verification
 */
public class verification extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IGestionEtudiant ee = new GestionEtudiantImp1();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public verification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		/*HttpSession session = request.getSession(); // creation de la session
		if (session != null) { // si session existe 
			response.sendRedirect("authentification.jsp");
		}*/
		
		String login=request.getParameter("user"); //verif de login et mp  
		String mp=request.getParameter("mp"); 
		user u1 =new user( login, mp) ;
		HttpSession session = request.getSession() ;
		
		if (session.getAttribute("u1") != null) {
			request.getRequestDispatcher("liste.jsp").forward(request, response);
		}else { 									//si session n'existe pas
													//verif de login et mp 
		boolean res ;							 
		res = ee.verif(u1);				//verif de login et mp 
		
		if (res==true ) {	
			// si ce user est autorisé 
			List <etudiant> l1= new ArrayList ();
			l1=ee.getAllEtudiant();
			session.setAttribute("u1", u1);  
			request.setAttribute("l1", l1);
			request.getRequestDispatcher("liste.jsp").forward(request, response);
			 // conserver ce user dans une session 	
			
		}else {
			request.getRequestDispatcher("authentification.jsp").forward(request, response);
			
		}
		
	}
	}
}
