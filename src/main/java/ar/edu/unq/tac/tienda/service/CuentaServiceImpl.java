package ar.edu.unq.tac.tienda.service;

import ar.edu.unq.tac.tienda.domain.Aplicacion;
import ar.edu.unq.tac.tienda.domain.Cuenta;
import ar.edu.unq.tac.tienda.repository.CuentaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CuentaServiceImpl implements CuentaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CuentaServiceImpl.class);

    @Autowired
    protected CuentaRepository cuentaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Cuenta> todas() {
        LOGGER.debug("Retrieving the list of all account");
        return cuentaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cuenta> buscar(String q) {
        LOGGER.debug("Buscando por : " + q);
        return cuentaRepository.buscar(q);
    }

}
