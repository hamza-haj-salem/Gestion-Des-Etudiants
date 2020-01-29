package dao1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao1.GestionEtudiantImp1;
import dao1.IGestionEtudiant;
import model1.etudiant;
import model1.user;


public class GestionEtudiantImp1 implements IGestionEtudiant {
	
	

	Connection connect ;
	public GestionEtudiantImp1 ( ) {
		try {	
			Class.forName("com.mysql.jdbc.Driver");	
			System.out.println("chargement de pilote avec succes");
			 connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp1","root","");
			System.out.println("la connexion à la base de données se fait avec succées !!!!");
			}
		catch(Exception e) {
				System.err.println("erreur de chargement de pilote "+e.getMessage());
				e.printStackTrace();
				
			}}
	
	
	
	public List <etudiant> getAllEtudiant(){
		
		List<etudiant> l1 = new ArrayList <etudiant>();
		
		try {
			PreparedStatement ps= connect.prepareStatement("select * from etudiant");
			ResultSet res = ps.executeQuery();
			while (res.next())
			{		
				etudiant e=new etudiant(res.getInt("num"),res.getString("nom"),res.getString("prenom"),res.getString("tel"));
				l1.add(e);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println(l1);
		return l1;
		
		
	}
	
	
	
	public void addEtudiant (etudiant e){	
			try {
				PreparedStatement ps = connect.prepareStatement ("insert into etudiant values (?,?,?,?)");
				ps.setInt(1,e.getNum());		
				ps.setString(2,e.getNom());
				ps.setString(3,e.getPrenom());
				ps.setString(4,e.getNumTel());
				ps.executeUpdate();
				System.out.println("etud ajoutée");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
	}
	public void deleteEtudiant(int num){
		
		try {
			PreparedStatement ps = connect.prepareStatement ("delete from etudiant where num = ?");
			//Statement stmt = connect.createStatement();
			ps.setInt(1, num);
			ps.executeUpdate();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
		
		public boolean verif(user u) {
			//Statement stmt ;
			try {
				PreparedStatement ps = connect.prepareStatement("select * from compte");
				ResultSet res = ps.executeQuery();
				while (res.next()) {
					if(u.getLogin().equals(res.getString("user")) && u.getMp().equals(res.getString("mp")) ) {
						return true ;
					}
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
			
		}
		
		public static void main(String[] args) {
			IGestionEtudiant ee = new GestionEtudiantImp1(); 
			String login = "root";
			String mp = "root";
			user u = new user (login,mp);
			boolean res ;
			res = ee.verif(u)  ;
			System.out.println(res);
			/*/List <etudiant> l1 = new ArrayList();
			l1=ee.getAllEtudiant();
			System.out.print(l1);*/
		
			

	}
		
		
	}