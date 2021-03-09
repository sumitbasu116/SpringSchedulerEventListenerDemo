package com.example.listener.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.listener.bean.Wallet;
import com.example.listener.service.WalletServiceImpl;

@RestController
public class WalletController {

	@Autowired
	private WalletServiceImpl walletServiceImpl;
	
	@GetMapping("/wallet")
	public Wallet getWallet()
	{
		return walletServiceImpl.getWallet();
	}
	
	@PutMapping("/load-wallet/{amount}")
	public Wallet loadMoneyIntoWallet(@PathVariable("amount") Double amount)
	{
		return walletServiceImpl.loadMoney(amount);
	}
	
	@PutMapping("/use-wallet/{amount}")
	public Wallet useMoneyFromWallet(@PathVariable("amount") Double amount)
	{
		return walletServiceImpl.deductMoney(amount);
	}
}
