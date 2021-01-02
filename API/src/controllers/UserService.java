package controllers;
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

import models.UserModel;


@Path("/users")
public class UserService {
	
	
	
	// Token in Header
	//Needed in the http header to acces this url
	@HeaderParam("Authorization")
	private String authorization;
	
	@Path("/login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response logIn(UserModel DataRequest) {
		//function to log in in the app
		
		
		//Obtain data from database 
		UserModel UserData = new UserModel();
		boolean a = UserData.getPassword() == DataRequest.getPassword();
		
		/*
		 * If a security layer was to be implemented
		 * we would store the password encrypted in our database
		 * and then encrypt DataRequest.getPassword()
		 * and then compare the values, so all the encryption
		 * mechanism runs on the server and not inside the client,
		 * which would make it more vulnerable. In this case a ppassword could only
		 * be stolen from the client as from the server the data is already encrypted when received
		 * so the server has no knowledge of what the original password was
		 * */

		boolean b = UserData.getUsername() == DataRequest.getUsername();
		
		if(a && b){
			return Response.status(200).build();
		}
		return Response.status(400).build();
	}

	@Path("/newuser")
	@GET
	public Response signIn(UserModel DataRequest){
		//Check if username is already in use from db
		//if(DataRequest.getUsername() == ...){
		//  return Response.status(400).build();	
		//}
		//However we do it
		
		//1 is for a new userid generated checking is not the same as another in db
		UserModel NewUser = new UserModel(1,DataRequest.getUsername(), DataRequest.getPassword());
		//Insertion of the new user to the db

		return Response.status(200).build();
	}
	
	
	
	
}