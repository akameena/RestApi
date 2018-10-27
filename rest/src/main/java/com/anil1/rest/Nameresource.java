package com.anil1.rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/name")
public class Nameresource {
	
	
	@GET()
	@Produces(MediaType.APPLICATION_XML)
	public List<Name> createResource() {
		
		Name name1 = new Name();
		name1.setFname("anil");
		name1.setMname("mname");
		name1.setLname("meena");
		
		Name name2 = new Name();
		name2.setFname("harish");
		name2.setLname("saini");
		name2.setMname("Kumar");
		
		Name name3 = new Name();
		name3.setFname("anshu");
		name3.setMname("kuar");
		name3.setLname("meena");
		List<Name>names =Arrays.asList(name1,name2,name3);
		
		return names;
	}
	
}
