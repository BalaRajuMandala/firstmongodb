package com.mandala.firstmongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserProfile {

	//@org.springframework.data.annotation.Id
	private long Id;
	private String firstname;
	private String lastname;
	private String occupation;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "UserProfile [Id=" + Id + ", firstname=" + firstname + ", lastname=" + lastname + ", occupation="
				+ occupation + "]";
	}
	
}
