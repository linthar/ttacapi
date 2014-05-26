package ar.edu.unq.tac.tienda.service;

import java.util.List;

import ar.edu.unq.tac.tienda.domain.Aplicacion;

public interface AplicacionService {

    List<Aplicacion> findAll();
	
    List<Aplicacion> buscar(String q);
	
}
