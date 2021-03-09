package com.example.listener.event.model;

public class WalletLoadOnLowBalanceEventModel extends BaseEventModel{

	private Double loadAmount;

	public WalletLoadOnLowBalanceEventModel(String eventType,String Date,Double amount){
		super(eventType,Date);
		this.loadAmount=amount;
	}
	public Double getLoadAmount() {
		return loadAmount;
	}

	public void setLoadAmount(Double loadAmount) {
		this.loadAmount = loadAmount;
	}
}
