package com.training.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.ClientConfig;;


public class MyClient {

	public static void main(String[] args) {
		
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target("http://localhost:4040/REST_Example/");
		
		System.out.println(target.path("jaxrs/simple/name").request().get(String.class));
		System.out.println(target.path("jaxrs").path("simple/delete/102").request().delete(String.class));
		
	}

}
