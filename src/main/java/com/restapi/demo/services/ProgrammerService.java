package com.restapi.demo.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.validation.annotation.Validated;

import com.restapi.demo.models.Programmer;
import com.restapi.demo.repositories.ProgrammerRepository;

@Validated
@Path("programmers")
public class ProgrammerService {
	ProgrammerRepository pr = new ProgrammerRepository();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Programmer> getProgrammers(){
		System.out.println("GetProgrammers");
		return pr.getProgrammers();
	}
	
	@GET
	@Path("programmer/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Programmer getProgrammers(@PathParam("id") int id){
		System.out.println(pr.getProgrammer(id).toString());
		return pr.getProgrammer(id);
	}
	
	@POST
	@Path("addnew")
	public Programmer createProgrammers(Programmer programmer){
		return programmer;
	}
	
}
