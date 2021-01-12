package com.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.interfaces.iDataInsDB;



public class PressInsDB extends DBManager implements iDataInsDB {

	@Override
	public boolean insert(double value) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	@Override
	public boolean insert(double value) {
		try
        {
			if(!this.isConn()) {
				this.connect();
			}	
			
			DBMax dbm = new DBMax();
			int id = dbm.lastDId();
			if(id == -1) {return false;}
			String query = "INSERT INTO Presion(id_dato,fecha,hora,valor,id_cama_Cama) VALUES(?,?,?,?,?)";
			PreparedStatement pstmt = this.conn.prepareStatement(query);
			pstmt.setInt(1, id + 1);
			pstmt.executeUpdate(query);
			
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        };
	}
	*/
}
