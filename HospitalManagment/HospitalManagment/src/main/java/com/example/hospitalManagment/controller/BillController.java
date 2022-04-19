package com.example.hospitalManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagment.Service.BillServiceImpl;
import com.example.hospitalManagment.entity.Bill;



@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RequestMapping(value = "/api/v1/")
public class BillController {

@Autowired
BillServiceImpl billServiceImpl;

@GetMapping(value = "/bills")
public List<Bill> getallBills(){
	return this.billServiceImpl.getallBills();
}


@PostMapping(value = "/bills")
public Bill createBill(@RequestBody Bill bills){
return this.billServiceImpl.createBill(bills);
}

}
