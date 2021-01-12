package com.models;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





//La cama es el broker?
//@JsonIgnoreProperties(ignoreUnknown = true)
public class DataModel implements Serializable{

	private static final long serialVersionUID = 1L;
	private long dataId, bedId;
	private Date date;
	private Time time;	
	private String type;
	private double value;
	
	public DataModel() {
		super();
		
	}

	public DataModel(long dataId, long bedId, Date date, Time time, String type, double value) {
		this.dataId = dataId;
		this.bedId = bedId;
		this.date = date;
		this.time = time;
		this.type = type;
		this.value = value;
	}

	public long getDataId() {
		return dataId;
	}

	public void setDataId(long dataId) {
		this.dataId = dataId;
	}

	public long getBedId() {
		return bedId;
	}

	public void setBedId(long bedId) {
		this.bedId = bedId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	
	
	

}
