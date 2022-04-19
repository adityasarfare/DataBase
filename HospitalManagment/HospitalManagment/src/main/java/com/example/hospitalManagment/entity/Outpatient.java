package com.example.hospitalManagment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OUTPATIENT")
public class Outpatient {

	
	@Id
	@Column(name = "Outpatient_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "date", nullable = false)
	private String date;
	
	
	@Column(name = "labNumber", nullable = false)
	private int labNumber;


	public Outpatient(Long id, String date, int labNumber) {
		super();
		this.id = id;
		this.date = date;
		this.labNumber = labNumber;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getLabNumber() {
		return labNumber;
	}


	public void setLabNumber(int labNumber) {
		this.labNumber = labNumber;
	}
	
	
}
