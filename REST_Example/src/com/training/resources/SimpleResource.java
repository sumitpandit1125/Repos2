package com.training.resources;

import java.util.HashMap;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.owlike.genson.Genson;
import com.training.entity.Employee;

@Path("/simple")
public class SimpleResource {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(){
		return "you have configured rest successfully";
	}
	
	@GET
	@Path("/name")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployee(){
		String empRep = null;
		Employee emp = new Employee(101,"Ramesh");
		Genson serializer = new Genson();
		empRep = serializer.serialize(emp);
		return empRep;
	}
	
	@POST
	@Path("/add")
	public String addEmployee(@FormParam("id") int id,
								@FormParam("name") String name){
		Employee emp = new Employee(id, name);
		String message = emp.toString();
		
		return "One Employee with " + message + "Added";
	}
	
	@DELETE
	@Path("/delete/{id}")
	public String deletEmployee(@PathParam("id") int id){
		return "one employe with id = "+id+" deleted";
	}
	
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Response findAllEmployee(@QueryParam("dept") String department){
		
		
		HashMap<String, Employee> list = new HashMap<String,Employee>();
		
		list.put("HR", new Employee(101, "RAmesh"));
		list.put("IT", new Employee(102, "Suresh"));
		list.put("AD", new Employee(103, "Mahes"));
		
		Employee found =list.get(department);
		
		return Response.status(200).entity(found).build();
		
		
	}
}
