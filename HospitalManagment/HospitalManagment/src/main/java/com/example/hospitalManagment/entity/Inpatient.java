package com.example.hospitalManagment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INPATIENT")
public class Inpatient {

	
	@Id
	@Column(name = "Inpatient_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "date_of_adm", nullable = false)
private String date_of_adm;

	@Column(name = "date_of_dis", nullable = false)
private String date_of_dis;
 
	public Inpatient(Long id, String date_of_adm, String date_of_dis, int labNumber, int roomNumber) {
		super();
		this.id = id;
		this.date_of_adm = date_of_adm;
		this.date_of_dis = date_of_dis;
		this.labNumber = labNumber;
		this.roomNumber = roomNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate_of_adm() {
		return date_of_adm;
	}

	public void setDate_of_adm(String date_of_adm) {
		this.date_of_adm = date_of_adm;
	}

	public String getDate_of_dis() {
		return date_of_dis;
	}

	public void setDate_of_dis(String date_of_dis) {
		this.date_of_dis = date_of_dis;
	}

	public int getLabNumber() {
		return labNumber;
	}

	public void setLabNumber(int labNumber) {
		this.labNumber = labNumber;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Column(name = "labNumber", nullable = false)
private int labNumber;
 
	@Column(name = "roomNumber", nullable = false)
private int roomNumber;
  



	
}
