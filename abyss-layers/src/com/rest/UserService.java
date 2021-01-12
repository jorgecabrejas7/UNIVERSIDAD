package com.rest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.controllers.LoginController;
import com.controllers.SignInController;
import com.database.DBMax;
import com.interactors.LoginInteractor;
import com.interactors.SignInInteractor;
import com.models.UserModel;


@Path("/users")
public class UserService{
	private DBMax dbids = new DBMax();

	
	
	



	@Path("/login")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response logIn(UserModel DataRequest) {
		System.out.println(DataRequest.getPassword());
		System.out.println(DataRequest.getUsername());	
		LoginController lc = new LoginController(new LoginInteractor());
		if(lc.logInApp(DataRequest.getUsername(), DataRequest.getPassword())) {
			lc.dispose();
			return Response.status(200).entity("Log in was succesful").build();
		}
		lc.dispose();
		return Response.status(400).entity("Wrong credentials").build();
	}

	@Path("/newuser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response signIn(UserModel DataRequest){
		SignInController sc = new SignInController(new SignInInteractor());
		
		if(sc.signInApp(DataRequest.getUsername(),DataRequest.getPassword())) {
			sc.dispose();
			return Response.status(200).entity("Sign In succesful").build();
		}
		sc.dispose();
		return Response.status(400).entity("Username already in use").build();
		
	}
	
	
	
	
}