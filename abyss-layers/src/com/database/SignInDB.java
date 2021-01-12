package com.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

import com.interfaces.iDisposable;

public class SignInDB extends DBManager implements iDisposable {
	
	public void dispose() {
		this.disconnect();
	}
	
	public boolean signin(String username, String password) {
		try {
			if(!this.isConn()) {
				this.connect();
			}
		
			String query = "SELECT nombre_usuario FROM public.\"Usuario\"";
			Statement stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
		 
			while(rs.next()) {
				boolean a;
				String un = rs.getString("nombre_usuario").replaceAll("\\s","");
				System.out.println(un + "=" + username);
				a = username.equals(un);
				if(a) {
					this.disconnect();
					return false;
				}
			
			}
			
			query = "INSERT INTO public.\"Usuario\"(nombre_usuario,id_usuario,contrasena) VALUES (?,?,?)";
			PreparedStatement pstmt = this.conn.prepareStatement(query);
			pstmt.setString(1,username);
			pstmt.setInt(2,new DBMax().lastUId() + 1);
			pstmt.setString(3,password);
			pstmt.executeUpdate();
		
			
		
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		this.disconnect();
		return true;
	}
}
