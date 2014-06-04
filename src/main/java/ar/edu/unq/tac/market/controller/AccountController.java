package ar.edu.unq.tac.market.controller;

import ar.edu.unq.tac.market.domain.Account;
import ar.edu.unq.tac.market.service.AccountService;
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
public class AccountController extends AbstractRestController {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(AccountController.class);

    @Autowired
    protected AccountService accountService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Account> findAll() {
        LOGGER.debug("Received request to list all accounts");
        return accountService.all();
    }

    @RequestMapping(value = "/find/{acc}", method = RequestMethod.GET)
    public List<Account> find(@PathVariable("acc") String acc) {
        LOGGER.debug("Received request to get an account");
        return accountService.find(acc);
    }
}