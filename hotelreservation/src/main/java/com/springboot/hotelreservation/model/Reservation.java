package com.springboot.hotelreservation.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reservation {
	
    @Id	
	int id;
    int guestId;
    int roomNo;
    Date checkIn;
    Date checkOut;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(int id, int guestId, int roomNo, Date checkIn, Date checkOut) {
		super();
		this.id = id;
		this.guestId = guestId;
		this.roomNo = roomNo;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", guestId=" + guestId + ", roomNo=" + roomNo + ", checkIn=" + checkIn
				+ ", checkOut=" + checkOut + "]";
	}
    
    

}
