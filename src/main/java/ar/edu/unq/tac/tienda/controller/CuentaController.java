package ar.edu.unq.tac.tienda.controller;

import ar.edu.unq.tac.tienda.domain.Cuenta;
import ar.edu.unq.tac.tienda.service.CuentaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/cuenta")
public class CuentaController extends AbstractRestController {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(CuentaController.class);

    @Autowired
    protected CuentaService cuentaService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Cuenta> findAll() {
        LOGGER.debug("Received request to list all accounts");
        return cuentaService.todas();
    }

    @RequestMapping(value = "/buscar/{acc}", method = RequestMethod.GET)
    public List<Cuenta> buscar(@PathVariable("acc") String acc) {
        LOGGER.debug("Received request to get an account");
        return cuentaService.buscar(acc);
    }
}