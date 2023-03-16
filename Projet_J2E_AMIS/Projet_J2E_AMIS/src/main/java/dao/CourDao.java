package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Cours;

public class CourDao implements CoursDao{

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ma_base");

	public void ajouter(Cours cours) {  
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(cours);
		entityManager.getTransaction().commit();

		entityManager.close();
	}

	public Cours findById(int courId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Cours cour = entityManager.find(Cours.class, courId);
		entityManager.getTransaction().commit();
		entityManager.close();
		return cour;
	}

	@SuppressWarnings("unchecked")
	public	List<Cours> findAll() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Cours>  listCours = entityManager.createQuery("SELECT e FROM Cours e").getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();

		return listCours;
	}

	public void supprimer(int courId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Cours cour = entityManager.find(Cours.class, courId);
		entityManager.remove(cour);
		entityManager.getTransaction().commit();

		entityManager.close();
	}
	@Override
	public void modifier(int coursId) {
		// TODO Auto-generated method stub
		
	}


		
}
