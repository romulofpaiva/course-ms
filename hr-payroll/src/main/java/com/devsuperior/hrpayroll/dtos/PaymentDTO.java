package com.devsuperior.hrpayroll.dtos;

import java.io.Serializable;

import com.devsuperior.hrpayroll.entities.Payment;

public class PaymentDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String name;
	private Double dailyIncome;
	private Integer days;
	private Double total;
	
	public PaymentDTO() {
	}
	
	public PaymentDTO( Payment payment ) {
		name = payment.getName();
		dailyIncome = payment.getDailyIncome();
		days = payment.getDays();
		setTotal(payment.getTotal());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}
