package ar.edu.unq.tac.market.repository.factory;

import ar.edu.unq.tac.market.domain.Account;
import ar.edu.unq.tac.market.domain.Application;

import java.util.ArrayList;
import java.util.List;

public class AccountFactory {

    public static List<Account> getAccountList(int quantity) {
        List<Account> list = new ArrayList<Account>(quantity);

        for (int i = quantity; i > 0; i--) {
            String accountDesc = "Acc_" + i;

            List<Application> apps = ApplicationFactory.getApplicationList(accountDesc, 5);
            Account account = new Account();
            account.setDescription(accountDesc);
            account.setInstalled(apps);
            list.add(account);
        }

        return list;
    }
}
