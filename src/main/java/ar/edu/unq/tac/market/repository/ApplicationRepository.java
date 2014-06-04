package ar.edu.unq.tac.market.repository;

import ar.edu.unq.tac.market.domain.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

    @Query("select a from Application a where a.name like %?1% or a.description like %?1%")
    List<Application> find(String q);


}
