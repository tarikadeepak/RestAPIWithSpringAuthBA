package com.restapi.demo.models;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/*
 * JAXB Annotations - https://howtodoinjava.com/jaxb/jaxb-annotations/
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder= {"id", "firstName", "lastName", "technology", "score"})
public class ProgrammerXML {
	
	private int id;
	private String firstName;
	private String lastName;
	@XmlElementWrapper(name = "technologies")
	private List<String> technology;
	private int score;
	
	
	public List<String> getTechnology() {
		return technology;
	}
	public void setTechnology(List<String> technology) {
		this.technology = technology;
	}

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
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public ProgrammerXML() {
		
	}
	public ProgrammerXML(int id, String firstName, String lastName, List<String> technology, int score) {
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
