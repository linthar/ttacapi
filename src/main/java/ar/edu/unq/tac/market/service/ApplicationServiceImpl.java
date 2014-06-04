package ar.edu.unq.tac.market.service;

import ar.edu.unq.tac.market.domain.Application;
import ar.edu.unq.tac.market.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationServiceImpl.class);

    @Autowired
    protected ApplicationRepository applicationRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Application> all() {
        LOGGER.debug("Retrieving the list of all apps");
        return applicationRepository.findAll();
    }


    @Override
    @Transactional(readOnly = true)
    public Application findOne(Long id) {
        LOGGER.debug("Retrieving the App with id: " + id);
        return applicationRepository.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Application> find(String q) {
        LOGGER.debug("Looking for : " + q);
        return applicationRepository.find(q);
    }

}
