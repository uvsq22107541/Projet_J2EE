package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CourDao;
import dao.EtudDao;
import dao.NivDao;
import entity.Adresse;
import entity.Cours;
import entity.Etudiant;
import entity.License;
import entity.Master;
import entity.Niveau;

public class Application {

	public static void main(String[] args) {
		
		//_________ ETUDIANT __________
		
		EtudDao daoEtudiant = new EtudDao();
		
		Etudiant etud1 = new Etudiant();
		etud1.setNom("SARAH OUHOCINE");
		
		Etudiant etud2 = new Etudiant();
		etud2.setNom("MARTIN TITI");
		
		Etudiant etud3 = new Etudiant();
		etud3.setNom("BOB ALICE");
		
		List<Etudiant> list_etudiants = new ArrayList<Etudiant>(); //ajouter les 3 étudiants 
		list_etudiants.add(etud1);
		list_etudiants.add(etud2);
		list_etudiants.add(etud3);
		
		//_________ ADRESSE __________
	
		Adresse addr = new Adresse();
		addr.setIntitule("01 PAUL BERT");
		addr.setVille("ROSNY SOUS-BOIS");
		etud1.setAdresse(addr);
		
		Adresse addr2 = new Adresse();
		addr2.setIntitule("29 AVENUE DU MARECHAM FOCH");
		addr2.setVille("NEUILLY PLAISANCE");
		etud2.setAdresse(addr2);
		
		Adresse addr3 = new Adresse();
		addr3.setIntitule("01 AVENUE DES CHAMPS ELYSEES");
		addr3.setVille("PARIS");
		etud3.setAdresse(addr3);
	
		//_________ COURS __________
		
		CourDao daoCours = new CourDao();
		
		Cours cours1 = new Cours();
		cours1.setDepartement("INFORMATIQUE");
		cours1.setEcts(5);
		cours1.setIntitule("J2EE");
		cours1.setNbheures(30);
		
		Cours cours2 = new Cours();
		cours2.setDepartement("ELECTRONIQUE");
		cours2.setEcts(5);
		cours2.setIntitule("IoT");
		cours2.setNbheures(25);
		
		Cours cours3 = new Cours();
		cours3.setDepartement("INFORMATIQUE");
		cours3.setEcts(6);
		cours3.setIntitule("GL");
		cours3.setNbheures(10);
		
		List<Cours> list_cours = new ArrayList<Cours>(); //ajouter les 3 cours 
		list_cours.add(cours1);
		list_cours.add(cours2);
		list_cours.add(cours3);

		list_cours.remove(cours3); //supprimer le 3eme cours GL de la liste des cours
		
		// Les 3 etudiants suivent les 2 cours restants : J2EE et IoT
		etud1.setCourssuivis(list_cours); //Cours suivis par l'etudiant 1 (SARAH)
		etud2.setCourssuivis(list_cours); //Cours suivis par l'etudiant 2 (MARTIN)
		etud3.setCourssuivis(list_cours); //Cours suivis par l'etudiant 3 (BOB)
		
		
		//_________ NIVEAU __________
		
		NivDao nivdao = new NivDao();
		
		License l3 = new License();
		l3.setECTS(60);
		l3.setLicence("Licence ISIL");
		nivdao.ajouter(l3);
		
		Master m2 = new Master();
		m2.setECTS(60);
		m2.setMaster("Master AMIS");
		nivdao.ajouter(m2);
		

		etud1.setEtude(m2);
		etud1.setAdresse(addr);
		
		etud2.setEtude(l3);
		etud2.setAdresse(addr2);
		
		etud3.setEtude(m2);
		etud3.setAdresse(addr3);
		
		daoCours.ajouter(cours1); //ajouter le cours 1 à la bdd
		daoCours.ajouter(cours2); //ajouter le cours 2 à la bdd
		
		daoEtudiant.ajouter(etud1);
		daoEtudiant.ajouter(etud2);
		daoEtudiant.ajouter(etud3);
		
		//list_etudiants.remove(etud3); // supprimer le 3eme étudiants BOB de la liste des étudiants
		


		
		
		
	}
}
