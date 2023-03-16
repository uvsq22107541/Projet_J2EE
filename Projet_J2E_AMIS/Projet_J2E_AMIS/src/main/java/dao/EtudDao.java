package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Etudiant;

public class EtudDao implements EtudiantDao{
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ma_base");

	public void ajouter(Etudiant etudiant) {  
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(etudiant);
		entityManager.getTransaction().commit();

		entityManager.close();
	}

	public Etudiant findById(int etudiantId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Etudiant etu = entityManager.find(Etudiant.class, etudiantId);
		entityManager.getTransaction().commit();
		entityManager.close();
		return etu;
	}

	@SuppressWarnings("unchecked")
	public	List<Etudiant> findAll() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Etudiant>  listEtudiant = entityManager.createQuery("SELECT e FROM Etudiant e").getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();

		return listEtudiant;
	}

	public void supprimer(int etudiantId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Etudiant etu = entityManager.find(Etudiant.class, etudiantId);
		entityManager.remove(etu);
		entityManager.getTransaction().commit();

		entityManager.close();
	}

	@Override
	public void modifier(int etudiantid) {
		// TODO Auto-generated method stub
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Etudiant etu = entityManager.find(Etudiant.class, etudiantid);
		etu.setNom("nouveau nom");
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
