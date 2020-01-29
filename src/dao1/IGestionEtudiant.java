package dao1;

import java.util.List;

import model1.etudiant;
import model1.user;

public interface IGestionEtudiant {
	public List <etudiant> getAllEtudiant();
	public void addEtudiant (etudiant e);
	public void deleteEtudiant(int num);
	public boolean verif(user u);

}
