package org.oar.app;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Note {
	@Id
	@GeneratedValue
	private int id ;
	private String name;
	private Date addDate;
	private String conetent;
	public Note(String name, Date addDate, String conetent) {
		super();
		this.id = new Random().nextInt(1000);
		this.name = name;
		this.addDate = addDate;
		this.conetent = conetent;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public String getConetent() {
		return conetent;
	}
	public void setConetent(String conetent) {
		this.conetent = conetent;
	}

}
