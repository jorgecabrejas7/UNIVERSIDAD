package controllers;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.tools.javac.util.List;

import models.DataModel;



@Path("/data")
public class DataService {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response sendData(DataModel DataRequest) {
		//insert data in db
		
		return Response.status(200).build();
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDataById(DataModel DataRequest) {
		return Response.status(200).entity(DataRequest).build();
	}
	
	public Response getDataAfterDate(DataModel DataRequest) {
		//Gather up all data before some date and send it
		//This is only necesary if data is processed in app and not on server
		ArrayList<DataModel> l = new ArrayList<DataModel>();
		return Response.status(200).entity(l).build();
	}
}
