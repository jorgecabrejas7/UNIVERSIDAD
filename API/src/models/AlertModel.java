package models;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlertModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long alertId;
	private Date date;
	private Time time;	
	private String type;
	
	public AlertModel() {
		super();
	}

	public AlertModel(long alertId, Date date, Time time, String type) {
		this.alertId = alertId;
		this.date = date;
		this.time = time;
		this.type = type;
	}

	public long getAlertId() {
		return alertId;
	}

	public void setAlertId(long alertId) {
		this.alertId = alertId;
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
	

}
