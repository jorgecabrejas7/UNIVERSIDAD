package controllers;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import models.BedModel;


@Path("/beds")
public class BedService{

	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response registerBed(BedModel newBed){
        //Check if the id is already  in use so the bed has already been registered into de system
        //if(newBed.getId() in bd){
        //  return Response.status(400).entity(newBed).build()    
        //}

        
        //Potential change of UserModel user to int userId
		newBed = new BedModel();
        if(newBed.getUser() == null){
            System.out.println("NO USER HAS BEEN SET FOR THIS BED YET - BED: " + newBed.getBedId());

        
        }
        
        //Insert bed into db code here
        return Response.status(200).build();


    }
}