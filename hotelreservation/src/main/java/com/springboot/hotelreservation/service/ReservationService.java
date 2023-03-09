package com.springboot.hotelreservation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.hotelreservation.dao.GuestRepository;
import com.springboot.hotelreservation.dao.ReservationRepository;
import com.springboot.hotelreservation.dao.RoomRepository;
import com.springboot.hotelreservation.model.Guest;
import com.springboot.hotelreservation.model.Reservation;
import com.springboot.hotelreservation.model.Room;

@Service
@Transactional
public class ReservationService {

	@Autowired
	private GuestRepository guestRepository;

	@Autowired
	private RoomRepository roomRepository;

	@Autowired
	private ReservationRepository reservationRepository;

	public void addGuest(Guest guest) {
		// TODO Auto-generated method stub
		guestRepository.save(guest);
	}

	public List<Guest> findGuests() {
		// TODO Auto-generated method stub
		return guestRepository.findAll();
	}

	public void addRoom(Room room) {
		// TODO Auto-generated method stub
		roomRepository.save(room);
	}

	public List<Room> findRooms() {
		// TODO Auto-generated method stub
		return roomRepository.findAll();
	}

	public void addReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		reservationRepository.save(reservation);
		Room room = changeStatus(reservation);
		room.setOccupied("yes");
		roomRepository.save(room);
	}

	public void endReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		reservationRepository.delete(reservation);
		Room room = changeStatus(reservation);
		room.setOccupied("no");
		roomRepository.save(room);
	}

	public Room changeStatus(Reservation reservation) {
		List<Room> rooms = roomRepository.findAll();
		Room room = null;
		for (Room room1 : rooms)
			if (reservation.getRoomNo() == room1.getRoomNo())
				room = room1;
		return room;

	}
}
