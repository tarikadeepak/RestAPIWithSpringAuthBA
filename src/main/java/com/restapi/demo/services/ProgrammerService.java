package com.restapi.demo.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.validation.annotation.Validated;

import com.restapi.demo.models.ProgrammerJSON;
import com.restapi.demo.models.ProgrammerXML;
import com.restapi.demo.repositories.ProgrammerRepositoryJSON;
import com.restapi.demo.repositories.ProgrammerRepositoryXML;

@Validated
@Path("programmers")
public class ProgrammerService {
	ProgrammerRepositoryXML prXML = new ProgrammerRepositoryXML();
	ProgrammerRepositoryJSON prJSON = new ProgrammerRepositoryJSON();
	@GET
	@Path("XML")
	@Produces(MediaType.APPLICATION_XML)
	public List<ProgrammerXML> getProgrammersXML(){
		System.out.println("GetProgrammers");
		return prXML.getProgrammers();
	}
	
	@GET
	@Path("JSON")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProgrammerJSON> getProgrammersJSON(){
		System.out.println("GetProgrammers");
		return prJSON.getProgrammers();
	}
	
	@GET
	@Path("programmer/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public ProgrammerXML getProgrammers(@PathParam("id") int id){
		System.out.println(prXML.getProgrammer(id).toString());
		return prXML.getProgrammer(id);
	}
	
	@POST
	@Path("addnew")
	public ProgrammerXML createProgrammers(ProgrammerXML programmer){
		return programmer;
	}
	
}
