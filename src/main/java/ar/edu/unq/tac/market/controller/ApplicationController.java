package ar.edu.unq.tac.market.controller;

import ar.edu.unq.tac.market.domain.Application;
import ar.edu.unq.tac.market.service.ApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/application")
public class ApplicationController extends AbstractRestController {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(ApplicationController.class);

    @Autowired
    protected ApplicationService applicationService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Application> findAll() {
        LOGGER.debug("Received request to list all users");
        return applicationService.all();
    }

    @RequestMapping(value = "/find/{q}", method = RequestMethod.GET)
    public List<Application> find(@PathVariable("q") String q) {
        LOGGER.debug("Received request to list all users");
        return applicationService.find(q);
    }


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Application find(@PathVariable("id") Long id) {
        LOGGER.debug("Received request to get Application for id: " + id);
        return applicationService.findOne(id);
    }
}