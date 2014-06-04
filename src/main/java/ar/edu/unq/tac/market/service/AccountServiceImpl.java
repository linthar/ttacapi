package ar.edu.unq.tac.market.service;

import ar.edu.unq.tac.market.domain.Account;
import ar.edu.unq.tac.market.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    protected AccountRepository accountRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Account> all() {
        LOGGER.debug("Retrieving the list of all account");
        return accountRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Account> find(String q) {
        LOGGER.debug("Looking for : " + q);
        return accountRepository.find(q);
    }

}
