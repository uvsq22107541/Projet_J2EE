package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cours")
public class Cours {
	@Id
	@Column(name = "cours_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int coursid;
	
	private String intitule;
	private int ects;
	private int nbheures;
	private String departement;
	public String getIntitule() {
		return intitule;
	}
	
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public int getEcts() {
		return ects;
	}
	public void setEcts(int ects) {
		this.ects = ects;
	}
	public int getNbheures() {
		return nbheures;
	}
	public void setNbheures(int nbheures) {
		this.nbheures = nbheures;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
}
