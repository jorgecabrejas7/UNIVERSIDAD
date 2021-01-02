package models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@JsonIgnoreProperties(ignoreUnknown = true)
public class UserModel implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private long id;
	private String username;
	private String password;
	
	public UserModel() {	
		super();
	}
	
	public UserModel(long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}