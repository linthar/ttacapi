package ar.edu.unq.tac.market.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unq.tac.market.repository.ResourceRepository;

public abstract class ResourceServiceImp<T> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ResourceServiceImp.class);

    @Transactional(readOnly = true)
    public List<T> all() {
        LOGGER.debug("Retrieving the list of all T");
        return getResourceRepository().findAll();
    }

    @Transactional(readOnly = true)
    public List<T> find(String q) {
        LOGGER.debug("Looking for : " + q);
        return getResourceRepository().find(q);
    }

    @Transactional(readOnly = true)
    public T findOne(Long id) {
        LOGGER.debug("Retrieving the T with id: " + id);
        return getResourceRepository().findOne(id);
    }
	
	protected abstract ResourceRepository<T> getResourceRepository();
	
}
