package ar.edu.unq.tac.market.init;

import ar.edu.unq.tac.market.domain.Account;
import ar.edu.unq.tac.market.repository.AccountRepository;
import ar.edu.unq.tac.market.repository.factory.AccountFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Inicializa la DB
 *
 * @author fgarcia
 */
@Component
public class InitDatabase {

    @Autowired
    private AccountRepository accountRepository;


    public void createAccounts(int quantity) {
        List<Account> accounts = AccountFactory.getAccountList(quantity);

        accountRepository.save(accounts);
    }

}
