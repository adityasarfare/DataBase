package com.example.hospitalManagment.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.hospitalManagment.entity.Bill;
import com.example.hospitalManagment.repository.BillRepository;



public class BillServiceImpl {

	@Autowired
	BillRepository billRepository;
	
	
	
	@Transactional
	public Bill createBill(Bill bill) {
		return billRepository.save(bill);
	}
	
	

	@Transactional
	public List<Bill> getallBills() {
		return billRepository.findAll();
	
	
}
}