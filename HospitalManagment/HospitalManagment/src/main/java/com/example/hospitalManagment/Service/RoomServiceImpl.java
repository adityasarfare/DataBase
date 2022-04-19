package com.example.hospitalManagment.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.hospitalManagment.entity.Room;
import com.example.hospitalManagment.repository.RoomRepository;

public class RoomServiceImpl {

	
	@Autowired
	RoomRepository roomRepository;
	
	
	
	@Transactional
	public Room createRoom(Room room) {
		return roomRepository.save(room);
	}
	
	

	@Transactional
	public List<Room> getallRooms() {
		return roomRepository.findAll();
	
	
}
}
