package com.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.models.DataModel;



public class DBMax extends DBManager{
	
	public int lastUId() {
		try {
			if(!this.isConn()) {
				this.connect();
			}
			
			String query = "Select MAX(id_usuario) from public.\"Usuario\"";
			Statement stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			return rs.getInt("MAX");
			
		}catch(SQLException e){
			e.printStackTrace();
			return -1;
		}
		
	}
	public int lastBId() {
		try {
			if(!this.isConn()) {
				this.connect();
			}
			
			String query = "Select MAX(id_cama) from public.\"Cama\"";
			Statement stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			return rs.getInt("id_cama");
			
		}catch(SQLException e){
			e.printStackTrace();
			return -1;
		}
	}
	//test for db selection
	public DataModel selectFirstData() {
		try {
			if(!this.isConn()) {
				this.connect();
			}
			
			String query = "Select * from public.\"Dato\"";
			Statement stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {			
				return new DataModel(rs.getInt("id_dato"),rs.getInt("id_cama_Cama"),rs.getDate("fecha"), rs.getTime("hora"),"",rs.getDouble("valor"));

			}else {
				System.out.println("Result Set happened to be empty");
			}
			return null;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	public int lastDId() {
		try {
			if(!this.isConn()) {
				this.connect();
			}
			
			String query = "Select MAX(id_dato) from public.\"Dato\"";
			Statement stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			return rs.getInt("id_dato");
			
		}catch(SQLException e){
			e.printStackTrace();
			return -1;
		}
		
	}
}
