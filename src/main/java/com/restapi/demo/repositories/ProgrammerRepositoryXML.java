package com.restapi.demo.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.restapi.demo.models.ProgrammerXML;

public class ProgrammerRepositoryXML {
	
	List<ProgrammerXML> programmers;
	ProgrammerXML p1 = new ProgrammerXML();
	ProgrammerXML p2 = new ProgrammerXML();
	public ProgrammerRepositoryXML(){
		p1.setId(1);
		p1.setFirstName("Deepak");
		p1.setLastName("Tarika");
		p1.setScore(60);
		List<String> list = new ArrayList<>(Arrays.asList("Java", "Mainframe"));
		p1.setTechnology(list);
		p2.setId(2);
		p2.setFirstName("Divya");
		p2.setLastName("Singh");
		p2.setScore(90);
		list = Arrays.asList("Java", "Angular");
		p2.setTechnology(list);
		ProgrammerXML p3 = new ProgrammerXML(3, "First", "Last", list, 80);
		programmers = Arrays.asList(p1,p2,p3);

	}
	
	public List<ProgrammerXML> getProgrammers(){
		return programmers;
	}
	
	public ProgrammerXML getProgrammer(int id){
		System.out.println(id + " " + id);
		for(ProgrammerXML p : programmers) {
			System.out.println("p.getId : " + p.getId());
			if(id == p.getId())
			{	
				return p;
			}	
		}
		return (new ProgrammerXML(99, "Data", "Not", new ArrayList<String>(), 404));
	}
	
}
