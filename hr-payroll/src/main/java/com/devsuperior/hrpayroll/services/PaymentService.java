package com.devsuperior.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.dtos.WorkerDTO;
import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment( Long workerId, Integer days ) {
		WorkerDTO worker = workerFeignClient.findById( workerId ).getBody();
		
		return new Payment( worker.getName(), worker.getDailyIncome(), days );
	}
}
