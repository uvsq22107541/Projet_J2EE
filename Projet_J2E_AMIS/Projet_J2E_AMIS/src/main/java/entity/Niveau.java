package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "niveau")
public class Niveau {
	@Id
	@Column(name = "niveau_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int niveau_id;
	private String intitule;
	
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
}