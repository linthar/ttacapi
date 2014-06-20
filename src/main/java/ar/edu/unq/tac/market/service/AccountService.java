package ar.edu.unq.tac.market.service;

import ar.edu.unq.tac.market.domain.Account;

import java.util.List;

public interface AccountService extends ResourceService<Account>{

    List<Account> all();

    List<Account> find(String q);

}
