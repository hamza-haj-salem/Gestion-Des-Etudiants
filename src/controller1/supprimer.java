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
 * Servlet implementation class supprimer
 */
public class supprimer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IGestionEtudiant ee = new GestionEtudiantImp1();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public supprimer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int num =Integer.parseInt(request.getParameter("Num"));
		ee.deleteEtudiant(num);
		List <etudiant> l1= new ArrayList ();
		l1=ee.getAllEtudiant();
		request.setAttribute("l1", l1);
		request.getRequestDispatcher("liste.jsp").forward(request, response);
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num =Integer.parseInt(request.getParameter("num"));
		ee.deleteEtudiant(num);
		List <etudiant> l1= new ArrayList ();
		l1=ee.getAllEtudiant();
		request.setAttribute("l1", l1);
		request.getRequestDispatcher("liste.jsp").forward(request, response);
	}

}
