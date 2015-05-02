package com.nanuvem.metagui.server.sample.entities;

import java.util.Date;

import javax.persistence.Entity;

import com.nanuvem.metagui.server.api.EntityType;

@Entity
public class Client extends EntityType{

	private String name;
	private Date birthdate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
}
