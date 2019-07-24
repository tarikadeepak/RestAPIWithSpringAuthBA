package com.restapi.demo.repositories;

import java.util.Arrays;
import java.util.List;

import com.restapi.demo.models.Programmer;

public class ProgrammerRepository {
	
	List<Programmer> programmers;
	Programmer p1 = new Programmer();
	Programmer p2 = new Programmer();
	public ProgrammerRepository(){
		p1.setId(1);
		p1.setFirstName("Deepak");
		p1.setLastName("Tarika");
		p1.setScore(60);
		p1.setTechnology("Java");
		p2.setId(2);
		p2.setFirstName("Divya");
		p2.setLastName("Singh");
		p2.setScore(90);
		p2.setTechnology("Java");
		Programmer p3 = new Programmer(3, "First", "Last", "MeanStack", 80);
		programmers = Arrays.asList(p1,p2,p3);

	}
	
	public List<Programmer> getProgrammers(){
		return programmers;
	}
	
	public Programmer getProgrammer(int id){
		System.out.println(id + " " + id);
		for(Programmer p : programmers) {
			System.out.println("p.getId : " + p.getId());
			if(id == p.getId())
			{	
				return p;
			}	
		}
		return (new Programmer(99, "Data", "Not", "Present", 404));
	}
	
}
