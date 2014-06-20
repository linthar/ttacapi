package ar.edu.unq.tac.market.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.edu.unq.tac.market.service.ResourceService;

public abstract class ResourceController<T> extends AbstractRestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ResourceController.class);

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<T> findAll() {
		LOGGER.info("Received request to list all "  + getResourceClass().getCanonicalName());
		LOGGER.debug("Received request to list all "  + getResourceClass().getCanonicalName());
		return getResourceService().all();
	}

	@RequestMapping(value = "/find/{acc}", method = RequestMethod.GET)
	public List<T> find(@PathVariable("acc") String acc) {
		LOGGER.debug("Received request to get a " + getResourceClass().getCanonicalName());
		return getResourceService().find(acc);
	}

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public T find(@PathVariable("id") Long id) {
        LOGGER.debug("Received request to get " + getResourceClass().getCanonicalName() + " for id: " + id);
        return getResourceService().findOne(id);
    }

	public abstract ResourceService<T> getResourceService();

	public abstract Class<?> getResourceClass();
	
	
	
}
