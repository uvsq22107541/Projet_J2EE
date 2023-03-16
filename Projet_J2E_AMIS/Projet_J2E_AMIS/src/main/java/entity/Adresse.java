package entity;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	private String intitule;
	private String ville;
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
}
