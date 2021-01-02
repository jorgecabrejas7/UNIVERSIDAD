package controllers;

import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import models.AlertModel;

/**
 * The alerts are checked by the app every x seconds,
 * when receiving data, the server checkes wheter it has to create a 
 * new alert 
 * Arduino directly produces alerts???
 */

@Path("/alerts")
public class AlertService{
	
    //Returns the last produce alert
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response lastAlert(){

        //QUERY TO OBTAIN LAST ALERT  code here

        AlertModel lastAlert = new AlertModel();

        return Response.status(200).entity(lastAlert).build();
    }

}