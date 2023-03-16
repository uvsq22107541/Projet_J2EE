package entity;

import javax.persistence.Entity;

@Entity(name = "master")
public class Master extends NiveauBase{
	private String Master;
	public String getDescription() {
		return super.getDescription() + " Master";
	}
	public String getMaster() {
		return Master;
	}
	public void setMaster(String master) {
		Master = master;
	}
}
