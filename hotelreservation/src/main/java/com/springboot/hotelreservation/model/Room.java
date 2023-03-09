package com.springboot.hotelreservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Room {
	
	@Id
    int roomNo;
	int floor;
	String occupied;
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(int roomNo, int floor, String occupied) {
		super();
		this.roomNo = roomNo;
		this.floor = floor;
		this.occupied = occupied;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getOccupied() {
		return occupied;
	}
	public void setOccupied(String occupied) {
		this.occupied = occupied;
	}
	@Override
	public String toString() {
		return "Room [roomNo=" + roomNo + ", floor=" + floor + ", occupied=" + occupied + "]";
	}
	
	

}
