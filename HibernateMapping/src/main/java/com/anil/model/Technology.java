package com.anil.model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Technology {
	
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Technology [tech_id=" + tech_id + ", technology=" + technology + "]";
	}
	@Id
	private int tech_id;
	private String technology;
	
	@OneToOne(mappedBy="tech" ,cascade=CascadeType.ALL)
	private Employee employee;
	
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
