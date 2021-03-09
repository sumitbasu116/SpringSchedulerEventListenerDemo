package com.example.listener;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.listener.event.model.WalletLoadOnLowBalanceEventModel;
import com.example.listener.service.WalletServiceImpl;

@Component
public class LoadOnLowBalanceListener {

	private static final Logger LOG = Logger.getLogger(LoadOnLowBalanceListener.class.getName());
	@Autowired
	WalletServiceImpl walletServiceImpl;
	
	@EventListener
	public void autoload(WalletLoadOnLowBalanceEventModel balanceEventModel)
	{
		LOG.info("********Loading Wallet*******");
		walletServiceImpl.loadMoney(balanceEventModel.getLoadAmount());
	}
}
