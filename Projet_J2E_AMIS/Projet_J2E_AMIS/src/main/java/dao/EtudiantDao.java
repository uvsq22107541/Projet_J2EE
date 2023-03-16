package dao;

import java.util.List;


import entity.Etudiant;

public interface EtudiantDao extends Dao<Etudiant>{
	public void ajouter(Etudiant etudiant);
	public void supprimer(int etudiantId);
	public void modifier(int etudiantId);
	public Etudiant findById(int etudiantId);
	public	List<Etudiant> findAll();


}
