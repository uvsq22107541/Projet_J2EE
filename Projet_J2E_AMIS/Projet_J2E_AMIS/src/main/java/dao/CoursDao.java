package dao;

import java.util.List;

import entity.Cours;

public interface CoursDao extends Dao<Cours>{
	public void ajouter(Cours cours);
	public void supprimer(int courId);
	public void modifier(int courId);
	public Cours findById(int courId);
	public	List<Cours> findAll();

}
