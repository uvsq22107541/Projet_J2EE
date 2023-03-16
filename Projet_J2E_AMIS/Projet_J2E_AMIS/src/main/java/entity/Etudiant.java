package entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "etudiant")
public class Etudiant {
	
	
	@Id
	@Column(name = "etudiant_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int etudiant_id;
	private String nom;
	
	@Embedded
	private Adresse adresse;
	
	@ManyToMany
	private List<Cours> courssuivis; // Pattern factory : pour créer facilement des nouveaux cours
	
	@ManyToOne
	private NiveauBase etude;        // Pattern stratégie :  1 seul niveau parmi les differents niveaux existants
	
	
	public List<Cours> getCourssuivis() {
		return courssuivis;
	}
	
	
	public void setCourssuivis(List<Cours> courssuivis) {
		this.courssuivis = courssuivis;
	}
	
	public NiveauBase getEtude() {
		return etude;
	}
	
	public void setEtude(NiveauBase etude) {
		this.etude = etude;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Adresse getadresse() {
		return this.adresse;
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}
