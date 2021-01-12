package com.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.interfaces.iDisposable;

public class LoginDB extends DBManager implements iDisposable {
	
	@Override
	public void dispose() {
		this.disconnect();
	}
	
	public boolean login(String username, String password) {
		try {
			if(!this.isConn()) {
				this.connect();
			}
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
			
			String query = "SELECT nombre_usuario, id_usuario, contrasena FROM public.\"Usuario\"";
			Statement stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			 
			while(rs.next()) {
				boolean a,b;
				String un = rs.getString("nombre_usuario").replaceAll("\\s","");
				String pw = rs.getString("contrasena").replaceAll("\\s","");
				System.out.println("DB = rcv");
				System.out.println(un + "=" + username);
				System.out.println(pw + "=" + password);
				
				a = username.equals(un);
				b = pw.equals(pw);	
				if(a & b) {
					this.disconnect();
					return true;
				}
				
			}
			
				
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		this.disconnect();
		return false;
		
	}

}
