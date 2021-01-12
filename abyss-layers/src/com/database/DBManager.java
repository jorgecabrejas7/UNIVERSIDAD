package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.interfaces.iDisposable;

public class DBManager implements iDisposable{
	Connection conn = null;
	
	
	
	
	
	public DBManager() {}
	public boolean isConn() {
		
		if(this.conn == null) {
			return false;
		}
		return true;
	}
	public  void connect() {
		this.conn = null;
        try {
            conn = DriverManager.getConnection(System.getenv("JDBC_DATABASE_URL"));
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
      
      
	}
	
	public void dispose() {
		 this.disconnect();
	}
			
			
	public void disconnect() {
		try {
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Error while closing database connection: \n");
			e.printStackTrace();
		}
		
		
	}
	
}
