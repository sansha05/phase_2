package com.entity;

import javax.persistence.Entity;

@Entity
public class Student {
	
	@javax.persistence.Id
	private int Id;
	
	private String name;
	private int rollno;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	
}
