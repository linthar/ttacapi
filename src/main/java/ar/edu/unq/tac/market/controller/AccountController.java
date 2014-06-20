package ar.edu.unq.tac.market.controller;

import ar.edu.unq.tac.market.domain.Account;
import ar.edu.unq.tac.market.service.AccountService;
import ar.edu.unq.tac.market.service.ResourceService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/account")
public class AccountController  extends ResourceController<Account> {

    //private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    protected AccountService accountService;

	@Override
	public ResourceService<Account> getResourceService() {
		return accountService;
	}
	
	@Override
	public Class<?> getResourceClass() {
		return AccountController.class;
	}
}