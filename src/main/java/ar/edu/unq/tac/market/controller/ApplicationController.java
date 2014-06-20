package ar.edu.unq.tac.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unq.tac.market.domain.Application;
import ar.edu.unq.tac.market.service.ApplicationService;
import ar.edu.unq.tac.market.service.ResourceService;

@RestController()
@RequestMapping("/application")
public class ApplicationController extends ResourceController<Application> {

    //private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);

    @Autowired
    protected ApplicationService applicationService;

	@Override
	public ResourceService<Application> getResourceService() {
		return applicationService;
	}

	@Override
	public Class<?> getResourceClass() {
		return ApplicationController.class;
	}
	
}