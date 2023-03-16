package service;

import java.util.List;

import entity.Etudiant;
import entity.Niveau;

public interface ServiceEtudiant {
	void ajouterEtudiant(Etudiant etudiant);
	void supprimerEtudiant(Etudiant etudiant);
	void ajouterCours(Etudiant etudiant);
	void afficherListeCours(Etudiant etudiant);
	List<Etudiant> findByNiveau(Niveau niveau);

	
	// et bien plus encore
}
