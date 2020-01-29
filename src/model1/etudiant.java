package model1;

public class etudiant {
	private int num;
	private String nom;
	private String prenom;
	private String numTel;
	public etudiant(int num, String nom, String prenom, String numTel) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
	}
	
	
	
	
	
	
	public etudiant(String nom, String prenom, String numTel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
	}






	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	@Override
	public String toString() {
		return "etudiant [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", numTel=" + numTel + "]";
	}
	
	

}
