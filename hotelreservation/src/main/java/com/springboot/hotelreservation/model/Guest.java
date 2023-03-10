package com.springboot.hotelreservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name ="guest")
public class Guest {
	
	@Id
	int guestId;
	String guestName="guest";
	String contact;
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Guest(int guestId, String guestName, String contact) {
		super();
		this.guestId = guestId;
		this.guestName = guestName;
		this.contact = contact;
	}
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Guest [guestId=" + guestId + ", guestName=" + guestName + ", contact=" + contact + "]";
	}
	
    

}
