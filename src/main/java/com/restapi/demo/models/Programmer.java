package com.restapi.demo.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Programmer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String technology;
	private int score;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Programmer() {
		
	}
	public Programmer(int id, String firstName, String lastName, String technology, int score) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.technology = technology;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Programmer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", technology="
				+ technology + ", score=" + score + "]";
	}
}
