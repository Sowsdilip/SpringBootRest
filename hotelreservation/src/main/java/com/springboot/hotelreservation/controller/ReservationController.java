package com.springboot.hotelreservation.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hotelreservation.model.Guest;
import com.springboot.hotelreservation.model.Reservation;
import com.springboot.hotelreservation.model.Room;
import com.springboot.hotelreservation.service.ReservationService;




@RestController
@RequestMapping("/api")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("wel-come")
	public String welsome() {
	  return "welcome to hotel reservation";
	}

	@PostMapping("add-guest")
	public void addGuest(Guest guest) {
     	reservationService.addGuest(guest);	
	}
	
	@GetMapping("show-guests")
	public List<Guest> showGuests() {
	 return reservationService.findGuests();
	}
	
	@PostMapping("add-room")
	public void addRoom(Room room) {
     	reservationService.addRoom(room);	
	}
	
	@GetMapping("show-rooms")
	public List<Room> showRooms() {
	 return reservationService.findRooms();
	}
	
	@PostMapping("check-in")
	public void checkIn(Reservation reservation) {
     	reservationService.addReservation(reservation);	
	}
	
	@PostMapping("check-out")
	public void checkOut(Reservation reservation) {
	  reservationService.endReservation(reservation);
	}

	
	
	
}
