package com.example.hospitalManagment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bills")
public class Bill {

	
	@Id
	@Column(name = "Bill_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "DoctorCharge", nullable = false)
	private String doctorCharge;
	
	@Column(name = "RoomCharge", nullable = false)
	private String roomCharge;
	
	@Column(name = "No_Of_days", nullable = false)
	private String no_of_days;
	
	public Bill(Long id, String doctorCharge, String roomCharge, String no_of_days, String lab_chargebill) {
		super();
		this.id = id;
		this.doctorCharge = doctorCharge;
		this.roomCharge = roomCharge;
		this.no_of_days = no_of_days;
		this.lab_chargebill = lab_chargebill;
	}

	@Column(name = "ChargeBill", nullable = false)
	private String lab_chargebill;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDoctorCharge() {
		return doctorCharge;
	}

	public void setDoctorCharge(String doctorCharge) {
		this.doctorCharge = doctorCharge;
	}

	public String getRoomCharge() {
		return roomCharge;
	}

	public void setRoomCharge(String roomCharge) {
		this.roomCharge = roomCharge;
	}

	public String getNo_of_days() {
		return no_of_days;
	}

	public void setNo_of_days(String no_of_days) {
		this.no_of_days = no_of_days;
	}

	public String getLab_chargebill() {
		return lab_chargebill;
	}

	public void setLab_chargebill(String lab_chargebill) {
		this.lab_chargebill = lab_chargebill;
	}
	
	
	
	
}
