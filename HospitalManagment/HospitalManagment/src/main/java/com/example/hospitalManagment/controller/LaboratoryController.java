package com.example.hospitalManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagment.Service.LaboratoryServiceImpl;

import com.example.hospitalManagment.entity.Laboratory;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RequestMapping(value = "/api/v1/")
public class LaboratoryController {

	@Autowired
	LaboratoryServiceImpl laboratoryServiceImpl;
	
	@GetMapping(value = "/laboratorys")
	public List<Laboratory> getallLaboratories(){
		return this.laboratoryServiceImpl.getallLaboratories();
	}


	@PostMapping(value = "/laboratorys")
	public Laboratory createBill(@RequestBody Laboratory laboratory){
	return this.laboratoryServiceImpl.createLaboratory(laboratory);
	}

	
}
