package com.anil.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Technology {
	
	@Id
	private int tech_id;
	private String technology;
	public int getTech_id() {
		return tech_id;
	}
	public void setTech_id(int tech_id) {
		this.tech_id = tech_id;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Technology(int tech_id, String technology) {
		super();
		this.tech_id = tech_id;
		this.technology = technology;
	}
	
	
	
}
