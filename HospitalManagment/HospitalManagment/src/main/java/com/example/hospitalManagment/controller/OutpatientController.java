package com.example.hospitalManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagment.Service.OutpatientServiceImpl;

import com.example.hospitalManagment.entity.Outpatient;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RequestMapping(value = "/api/v1/")
public class OutpatientController {

	
	@Autowired
	OutpatientServiceImpl outpatientServiceImpl;
	
	
	@GetMapping(value = "/outpatients")
	public List<Outpatient> getallOutpatients(){
		return this.outpatientServiceImpl.getallOutpatients();
	}


	@PostMapping(value = "/outpatients")
	public Outpatient createBill(@RequestBody Outpatient outpatient){
	return this.outpatientServiceImpl.createOutpatient(outpatient);
	}

}
