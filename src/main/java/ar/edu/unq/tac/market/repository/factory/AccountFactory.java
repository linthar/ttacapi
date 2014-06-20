package ar.edu.unq.tac.market.repository.factory;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.tac.market.domain.Account;
import ar.edu.unq.tac.market.domain.Application;

public class AccountFactory {

	  public static List<Account> getAccountList(int quantity) {

	    	List<Application> apps = ApplicationFactory.getApplicationList();
	    	
	        List<Account> list = new ArrayList<Account>(quantity);

	        for (int i = quantity; i > 0; i--) {
	            String accountDesc = "Acc_" + i;
	            Account account = new Account();
	            account.setDescription(accountDesc);
	            account.setInstalled(apps);
	            list.add(account);
	        }

	        return list;
	    }
}
