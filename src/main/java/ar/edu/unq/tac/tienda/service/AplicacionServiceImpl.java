package ar.edu.unq.tac.tienda.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unq.tac.tienda.domain.Aplicacion;
import ar.edu.unq.tac.tienda.repository.AplicacionRepository;

@Service
public class AplicacionServiceImpl implements AplicacionService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AplicacionServiceImpl.class);

	@Autowired
	protected AplicacionRepository aplicacionRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Aplicacion> todas() {
		LOGGER.debug("Retrieving the list of all apps");
		return aplicacionRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Aplicacion> buscar(String q) {
		LOGGER.debug("Buscando por : " + q);
		return aplicacionRepository.buscar(q);
	}
	
}
