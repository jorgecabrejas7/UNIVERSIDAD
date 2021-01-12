package com.rest;


import javax.ws.rs.Consumes; 
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType; 
import javax.ws.rs.core.Response;

import com.database.DBMax;

import com.models.DataModel;


@Path("/helloworld") 
@Produces(MediaType.APPLICATION_JSON) 
@Consumes(MediaType.APPLICATION_JSON) 
public class HelloWorldRest {               

    @GET  
    public Response sayHello() {     
        DBMax d = new DBMax();

        DataModel dd = d.selectFirstData();
        if (dd == null) {
        	return Response.status(400).build();
        }
        return Response.status(200).entity(dd).build();

    }
}