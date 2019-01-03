package com.mapping2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Instructor {
	@Id
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Instructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
