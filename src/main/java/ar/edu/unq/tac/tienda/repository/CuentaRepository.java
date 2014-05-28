package ar.edu.unq.tac.tienda.repository;

import ar.edu.unq.tac.tienda.domain.Aplicacion;
import ar.edu.unq.tac.tienda.domain.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by frepond on 5/28/14.
 */
public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
    @Query("select c from Cuenta c where c.descripcion like %?1%")
    List<Cuenta> buscar(String q);
}
