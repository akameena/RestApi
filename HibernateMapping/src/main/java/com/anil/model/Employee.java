package com.anil.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	@Id
	private int id;
	private String name;
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="tech_id")
	Technology tech ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Technology getTech() {
		return tech;
	}
	public void setTech(Technology tech) {
		this.tech = tech;
	}
	public Employee(int id, String name, Technology tech) {
		super();
		this.id = id;
		this.name = name;
		this.tech = tech;
	}
	
	
}
