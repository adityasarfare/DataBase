package com.example.hospitalManagment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Room")
public class Room {

	@Id
	@Column(name = "Room_Number")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long roomNumber;
	
	
	@Column(name = "Room_Type", nullable = false)
	private String roomType;
	
	
	@Column(name = "Status", nullable = false)
	private String status;


	public Room(Long roomNumber, String roomType, String status) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.status = status;
	}


	public Long getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Long roomNumber) {
		this.roomNumber = roomNumber;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
