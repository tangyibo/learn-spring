package io.gitee.inrgihc.config.service.impl;

import io.gitee.inrgihc.config.dao.AccountRepository;
import io.gitee.inrgihc.config.service.TransferService;

public class TransferServiceImpl implements TransferService {

	public AccountRepository accountRepository;

	public TransferServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
}
