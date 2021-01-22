package com.devsuperior.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment( Long workerId, Integer days ) {
		return new Payment( "Rômulo", 200.00, days );
	}
}
