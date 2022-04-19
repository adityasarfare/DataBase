package com.example.hospitalManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagment.Service.PatientServiceImpl;

import com.example.hospitalManagment.entity.Patient;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RequestMapping(value = "/api/v1/")
public class PatientController {

	
	@Autowired
	PatientServiceImpl patientServiceImpl;
	
	@GetMapping(value = "/patients")
	public List<Patient> getallPatients(){
		return this.patientServiceImpl.getallPatients();
	}


	@PostMapping(value = "/patients")
	public Patient createPatient(@RequestBody Patient patient){
	return this.patientServiceImpl.createPatient(patient);
	}
	
}
