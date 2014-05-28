package ar.edu.unq.tac.tienda.controller;

import ar.edu.unq.tac.tienda.domain.Aplicacion;
import ar.edu.unq.tac.tienda.service.AplicacionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/aplicacion")
public class AplicacionController extends AbstractRestController {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(AplicacionController.class);

    @Autowired
    protected AplicacionService aplicacionService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Aplicacion> findAll() {
        LOGGER.debug("Received request to list all users");
        return aplicacionService.todas();
    }

    @RequestMapping(value = "/buscar/{q}", method = RequestMethod.GET)
    public List<Aplicacion> buscar(@PathVariable("q") String q) {
        LOGGER.debug("Received request to list all users");
        return aplicacionService.buscar(q);
    }
}