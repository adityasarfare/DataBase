package com.example.hospitalManagment.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.hospitalManagment.entity.Patient;
import com.example.hospitalManagment.repository.PatientRepository;

public class PatientServiceImpl {

	
	@Autowired
	PatientRepository patientRepository;
	
	@Transactional
	public Patient createPatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	

	@Transactional
	public List<Patient> getallPatients() {
		return patientRepository.findAll();
	
	
}
	
}
