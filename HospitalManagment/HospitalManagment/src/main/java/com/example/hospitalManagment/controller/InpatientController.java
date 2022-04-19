package com.example.hospitalManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagment.Service.InpatientServiceImpl;

import com.example.hospitalManagment.entity.Inpatient;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RequestMapping(value = "/api/v1/")
public class InpatientController {

	
	@Autowired
	InpatientServiceImpl inpatientServiceImpl;
	
	
	@GetMapping(value = "/inpatients")
	public List<Inpatient> getallInpatients(){
		return this.inpatientServiceImpl.getallInpatients();
	}


	@PostMapping(value = "/inpatients")
	public Inpatient createInpatient(@RequestBody Inpatient inpatient){
	return this.inpatientServiceImpl.createInpatient(inpatient);
	}
	
}
