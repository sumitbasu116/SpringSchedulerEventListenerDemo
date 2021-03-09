package com.example.listener.bean;

public class Wallet {

	private String name;
	private Double amount;
	
	public Wallet()
	{
		this.amount=0.0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = this.amount + amount;
	}
	
	public void deductAmount(Double amount) {
		this.amount = this.amount - amount;
	}
}
