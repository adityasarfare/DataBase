package com.example.hospitalManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagment.Service.DoctorServiceImpl;

import com.example.hospitalManagment.entity.Doctor;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RequestMapping(value = "/api/v1/")
public class DoctorController {

	
	@Autowired
	DoctorServiceImpl doctorServiceImpl;
	
	
	@GetMapping(value = "/doctors")
	public List<Doctor> getallDoctors(){
		return this.doctorServiceImpl.getallDoctors();
	}


	@PostMapping(value = "/bills")
	public Doctor createDoctor(@RequestBody Doctor doctors){
	return this.doctorServiceImpl.createDoctor(doctors);
	}
}
