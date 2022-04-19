package com.example.hospitalManagment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENT")
public class Patient {

	
	@Id
	@Column(name = "Patient_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientId;
	
	@Column(name = "First_Name", nullable = false)
	private String firstName;
	
	@Column(name = "Last_Name", nullable = false)
	private String lastName;
	
	@Column(name = "Age", nullable = false)
	private String age;
	
	@Column(name = "Gender", nullable = false)
	private String gender;
	
	@Column(name = "Address", nullable = false)
	private String address;
	
	@Column(name = "DoctorID", nullable = false)
	private int doctorId;
	
	@Column(name = "Disease", nullable = false)
	private String disease;

	public Patient(Long patientId, String firstName, String lastName, String age, String gender, String address,
			int doctorId, String disease) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.doctorId = doctorId;
		this.disease = disease;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	
	
	
	
}
