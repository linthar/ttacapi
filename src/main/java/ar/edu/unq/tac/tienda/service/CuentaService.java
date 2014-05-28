package ar.edu.unq.tac.tienda.service;

import ar.edu.unq.tac.tienda.domain.Cuenta;

import java.util.List;

public interface CuentaService {

    List<Cuenta> todas();

    List<Cuenta> buscar(String q);

}
