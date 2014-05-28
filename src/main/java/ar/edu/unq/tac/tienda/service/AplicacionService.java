package ar.edu.unq.tac.tienda.service;

import ar.edu.unq.tac.tienda.domain.Aplicacion;

import java.util.List;

public interface AplicacionService {

    List<Aplicacion> todas();

    List<Aplicacion> buscar(String q);

}
