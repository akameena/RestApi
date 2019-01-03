package com.mapping2.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Courses {
	public Courses(int cid, String title, Instructor instructor) {
		super();
		this.cid = cid;
		this.title = title;
		this.instructor = instructor;
	}
	@Id
	private int cid;
	private String title;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_id")
	private Instructor instructor;
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	

}
