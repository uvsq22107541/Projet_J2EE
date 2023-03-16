package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Niveau;
import entity.NiveauBase;

public class NivDao implements NiveauDao{

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ma_base");

	@Override
	public void ajouter(NiveauBase nb) {  
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(nb);
		entityManager.getTransaction().commit();

		entityManager.close();
	}
	@Override
	public NiveauBase findById(int niveaubaseId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		NiveauBase nb = entityManager.find(NiveauBase.class, niveaubaseId);
		entityManager.getTransaction().commit();
		entityManager.close();
		return nb;
	}

	@SuppressWarnings("unchecked")
	public	List<NiveauBase> findAll() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		List<NiveauBase>  listnivs = entityManager.createQuery("SELECT e FROM NiveauBase e").getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();

		return listnivs;
	}

	public void supprimer(int niveauId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		NiveauBase nb = entityManager.find(NiveauBase.class, niveauId);
		entityManager.remove(nb);
		entityManager.getTransaction().commit();

		entityManager.close();
	}
	@Override
	public void modifier(int niveauId) {
		// TODO Auto-generated method stub
		
	}
	
	
}
