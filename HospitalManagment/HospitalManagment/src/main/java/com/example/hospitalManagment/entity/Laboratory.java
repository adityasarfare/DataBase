package com.example.hospitalManagment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LABORATORY")
public class Laboratory {

	
	@Id
	@Column(name = "Laboratory_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long labNumber;
	
	@Column(name = "date", nullable = false)
	private String date;
	
	
	@Column(name = "amount", nullable = false)
	private int amount;
	
	
	@Column(name = "patientId", nullable = false)
	private int patientId;
	
	
	
	@Column(name = "doctorId", nullable = false)
	private int doctorId;



	public Laboratory(Long labNumber, String date, int amount, int patientId, int doctorId) {
		super();
		this.labNumber = labNumber;
		this.date = date;
		this.amount = amount;
		this.patientId = patientId;
		this.doctorId = doctorId;
	}



	public Long getLabNumber() {
		return labNumber;
	}



	public void setLabNumber(Long labNumber) {
		this.labNumber = labNumber;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public int getPatientId() {
		return patientId;
	}



	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}



	public int getDoctorId() {
		return doctorId;
	}



	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	

	
	
}
