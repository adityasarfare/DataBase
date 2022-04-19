package com.example.hospitalManagment.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.hospitalManagment.entity.Doctor;
import com.example.hospitalManagment.repository.DoctorRepository;

public class DoctorServiceImpl {

	
	@Autowired
    DoctorRepository doctorRepository;
	
	 
	@Transactional
	public Doctor createDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	
	

	@Transactional
	public List<Doctor> getallDoctors() {
		return doctorRepository.findAll();
	
	
}
}
