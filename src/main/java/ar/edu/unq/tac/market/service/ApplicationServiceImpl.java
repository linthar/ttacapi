package ar.edu.unq.tac.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unq.tac.market.domain.Application;
import ar.edu.unq.tac.market.repository.ApplicationRepository;
import ar.edu.unq.tac.market.repository.ResourceRepository;

@Service
public class ApplicationServiceImpl extends ResourceServiceImp<Application> implements ApplicationService {

	//private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationServiceImpl.class);

    @Autowired
    protected ApplicationRepository applicationRepository;

	@Override
	protected ResourceRepository<Application> getResourceRepository() {
		return applicationRepository;
	}

}
