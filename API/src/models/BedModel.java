package models;

import java.io.Serializable;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





//La cama es el broker?
@JsonIgnoreProperties(ignoreUnknown = true)
public class BedModel implements Serializable{

	private static final long serialVersionUID = 1L;
	private long bedId;
	//Potential change of user to userId(int)
	private UserModel user = null;


	public BedModel(){
		super();
	}

	public BedModel(long bedId, UserModel user){
		this.user = user;
		this.bedId = bedId;
	}

	public long getBedId() {
		return bedId;
	}

	public void setBedId(long bedId) {
		this.bedId = bedId;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	

}
