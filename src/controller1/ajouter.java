package controller1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao1.GestionEtudiantImp1;
import dao1.IGestionEtudiant;
import model1.etudiant;

/**
 * Servlet implementation class ajouter
 */
public class ajouter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IGestionEtudiant ee = new GestionEtudiantImp1();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouter() {
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
		//int num =Integer.parseInt(request.getParameter("num"));
		String nom =request.getParameter("nom");
		String prenom =request.getParameter("prenom");
		String numtel =request.getParameter("numtel");
		etudiant e = new etudiant (nom,prenom,numtel);
		ee.addEtudiant(e);
		List <etudiant> l1= new ArrayList ();
		l1=ee.getAllEtudiant();
		request.setAttribute("l1", l1);
		request.getRequestDispatcher("liste.jsp").forward(request, response);
	}

}
