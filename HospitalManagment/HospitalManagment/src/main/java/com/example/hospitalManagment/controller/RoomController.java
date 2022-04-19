package com.example.hospitalManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagment.Service.RoomServiceImpl;

import com.example.hospitalManagment.entity.Room;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RequestMapping(value = "/api/v1/")
public class RoomController {

	
	@Autowired
	RoomServiceImpl roomServiceImpl;
	
	
	@GetMapping(value = "/rooms")
	public List<Room> getallRooms(){
		return this.roomServiceImpl.getallRooms();
	}


	@PostMapping(value = "/rooms")
	public Room createroom(@RequestBody Room room){
	return this.roomServiceImpl.createRoom(room);
	}

}
