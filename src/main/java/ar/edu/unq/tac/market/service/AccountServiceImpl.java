package ar.edu.unq.tac.market.service;

import ar.edu.unq.tac.market.domain.Account;
import ar.edu.unq.tac.market.repository.AccountRepository;
import ar.edu.unq.tac.market.repository.ResourceRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountServiceImpl extends ResourceServiceImp<Account> implements AccountService {

    //private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    protected AccountRepository accountRepository;
  
	@Override
	protected ResourceRepository<Account> getResourceRepository() {
		return accountRepository;
	}

}
