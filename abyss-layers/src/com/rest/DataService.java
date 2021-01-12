package com.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.controllers.DataController;
import com.models.DataModel;


@Path("/data")
public class DataService {
	
	/*
	@GET
	@Path("/temp")
	@Consumes(MediaType.TEXT_PLAIN)
	public Response rcvData(DataModel DataRequest) {
		DataController dc  = new DataController(new TempReceiver());
		if(dc.insertData(DataRequest.getValue())) {
			
			return Response.status(200).build();
		}
		
		return Response.status(400).build();
		
	}
	
	*/

}


