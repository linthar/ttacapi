package ar.edu.unq.tac.market.repository;

import ar.edu.unq.tac.market.domain.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long>, ResourceRepository<Account> {
    @Query("select c from Account c where c.description like %?1%")
    List<Account> find(String q);
}
