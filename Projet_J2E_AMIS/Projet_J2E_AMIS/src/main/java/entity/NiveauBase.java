package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity(name = "niveaubase")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class NiveauBase implements NiveauInter{
	
	@Id
	@Column(name = "niveau_base_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int niveau_base_id;
	
	private int ECTS;
	
	public int getECTS() {
		return this.ECTS;
	}
	public void setECTS(int ECTS) {
		this.ECTS = ECTS;
	}
	
	public String getDescription() {
		return "ects = " +  this.ECTS;
	}
}
