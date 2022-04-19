package com.example.hospitalManagment.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.hospitalManagment.entity.Inpatient;
import com.example.hospitalManagment.repository.InpatientRepository;

public class InpatientServiceImpl {

	@Autowired
	InpatientRepository inpatientRepository;
	
	
	@Transactional
	public Inpatient createInpatient(Inpatient inpatient) {
		return inpatientRepository.save(inpatient);
	}
	
	

	@Transactional
	public List<Inpatient> getallInpatients() {
		return inpatientRepository.findAll();
	
	
}
	
}
