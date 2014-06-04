package ar.edu.unq.tac.market.service;

import ar.edu.unq.tac.market.domain.Application;

import java.util.List;

public interface ApplicationService {

    List<Application> all();

    List<Application> find(String q);

    Application findOne(Long id);

}
