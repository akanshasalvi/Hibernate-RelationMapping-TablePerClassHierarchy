package com.tpch.entities;

import java.io.Serializable;
import java.util.Date;

public class Payment implements Serializable{
	
	protected int payment_no;
	protected Date paymentDate;
	protected String description;
	protected double amount;
	public int getPayment_no() {
		return payment_no;
	}
	public void setPayment_no(int payment_no) {
		this.payment_no = payment_no;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [payment_no=" + payment_no + ", paymentDate=" + paymentDate + ", description=" + description
				+ ", amount=" + amount + "]";
	}
	
}
