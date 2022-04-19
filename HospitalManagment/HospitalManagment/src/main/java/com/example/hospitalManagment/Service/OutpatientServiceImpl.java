package com.example.hospitalManagment.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.hospitalManagment.entity.Outpatient;
import com.example.hospitalManagment.repository.OutpatientRepository;

public class OutpatientServiceImpl {

	@Autowired
	OutpatientRepository outpatientRepository;
	
	
	

	@Transactional
	public Outpatient createOutpatient(Outpatient outpatient) {
		return outpatientRepository.save(outpatient);
	}
	
	

	@Transactional
	public List<Outpatient> getallOutpatients() {
		return outpatientRepository.findAll();
	
	
}
}
