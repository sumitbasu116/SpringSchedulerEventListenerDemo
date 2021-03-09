package com.example.listener.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.example.listener.MyDatabase;
import com.example.listener.bean.Wallet;
import com.example.listener.event.model.WalletLoadOnLowBalanceEventModel;

@Service
public class WalletServiceImpl {

	private static Double MIN_BAL=1.0;
	
	@Autowired
	ApplicationEventPublisher eventPublisher;
	
	public Wallet getWallet() {
		Wallet wallet = MyDatabase.wallet();
		return wallet;
	}

	public Wallet loadMoney(Double amount) {
		Wallet wallet = MyDatabase.wallet();
		wallet.setAmount(amount);
		return wallet;
	}

	public Wallet deductMoney(Double amount) {
		Wallet wallet = MyDatabase.wallet();
		wallet.deductAmount(amount);
		return wallet;
	}
	
	public boolean isMinimumBalanceReaced() {
		Wallet wallet = MyDatabase.wallet();
		if(wallet.getAmount()< MIN_BAL)
			return true;
		return false;
	}

	public void autoloadMoney() {
		if(isMinimumBalanceReaced())
			eventPublisher.publishEvent(new WalletLoadOnLowBalanceEventModel("Autoload-event","",MIN_BAL));
	}
}
