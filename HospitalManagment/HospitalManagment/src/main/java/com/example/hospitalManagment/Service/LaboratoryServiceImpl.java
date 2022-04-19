package com.example.hospitalManagment.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.hospitalManagment.entity.Laboratory;
import com.example.hospitalManagment.repository.LaboratoryRepository;

public class LaboratoryServiceImpl {

	
	@Autowired
	LaboratoryRepository labRepository;
	
	
	
	@Transactional
	public Laboratory createLaboratory(Laboratory laboratory) {
		return labRepository.save(laboratory);
	}
	
	

	@Transactional
	public List<Laboratory> getallLaboratories() {
		return labRepository.findAll();
	
	
}
}
