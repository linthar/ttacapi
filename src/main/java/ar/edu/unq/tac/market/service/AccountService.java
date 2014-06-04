package ar.edu.unq.tac.market.service;

import ar.edu.unq.tac.market.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> all();

    List<Account> find(String q);

}
