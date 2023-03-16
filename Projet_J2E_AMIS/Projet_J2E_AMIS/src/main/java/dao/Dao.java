package dao;

import java.util.List;

public interface Dao<T> {
	public void ajouter(T t);
	public void supprimer(int tId);
	public void modifier(int tId);
	public T findById(int tid);
	public	List<T> findAll();


	
// Methode du CRUD
}
