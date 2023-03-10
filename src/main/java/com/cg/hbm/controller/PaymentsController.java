package com.cg.hbm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hbm.entity.Payments;
import com.cg.hbm.service.PaymentsServiceImpl;

@RestController
@RequestMapping("/payment")
public class PaymentsController {
	
	@Autowired
	private PaymentsServiceImpl paymentsServiceImpl;
    @PostMapping("/createPayment") 
	public ResponseEntity<Payments> cretaePayments(@RequestBody Payments payments){
		
		Payments p=paymentsServiceImpl.addPayments(payments);
		return new ResponseEntity<Payments>(p,HttpStatus.CREATED);
		
	}
	
}
