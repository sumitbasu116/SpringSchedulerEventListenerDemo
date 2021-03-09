package com.example.listener.scheduler;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.listener.service.WalletServiceImpl;

@Component
public class EventScheduler {

	private static final Logger LOG = Logger.getLogger(EventScheduler.class.getName());
	
	@Autowired
	private WalletServiceImpl walletServiceImpl;
	
	@Scheduled(fixedDelay = 2000)
	public void messageEventSchedule()
	{
		walletServiceImpl.autoloadMoney();
	}
}
