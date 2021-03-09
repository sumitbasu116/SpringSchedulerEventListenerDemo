package com.example.listener;

import org.springframework.context.annotation.Configuration;

import com.example.listener.bean.Wallet;

@Configuration
public class MyDatabase {

	public static Wallet wallet = new Wallet();
	
	public static Wallet wallet()
	{
		wallet.setName("Application Test Wallet");
		return wallet;
	}
}
