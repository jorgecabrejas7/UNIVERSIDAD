package database;

import models.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
	

	
	
	
	
	public DBManager() {}

	public static Connection connect() {
		Connection conn = null;
        try {
            conn = DriverManager.getConnection(System.getenv("JDBC_DATABASE_URL"));
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
      
        return conn;
		 
	}
	
	public List<DataModel> getTempOverNight(){
		
		ArrayList<DataModel> night = new ArrayList<>();
		LocalDate  date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//La query esta mal
		String SQL = "SELECT * FROM Temperatura WHERE fecha < "  + date.format(formatter) + "ORDER BY fecha";
		try {
			Connection conn = connect();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			
			while(rs.next()) {
				
				long idDato = rs.getInt("id_dato");
				long bedId = rs.getInt("id_cama_Cama");
				Date instanceDate = rs.getDate("fecha");
				Time time = rs.getTime("hora");
				double value = rs.getDouble("valor");
				
				DataModel dm = new DataModel(idDato,bedId,instanceDate,time,"Temperatura", value);
				night.add(dm);
			}
			
			
			
		}catch(SQLException ex){
			System.out.println(ex.getMessage());
		}
		
		return night;
		
			
	}
	
}
