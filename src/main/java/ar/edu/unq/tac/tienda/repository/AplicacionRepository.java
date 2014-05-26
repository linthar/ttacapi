package ar.edu.unq.tac.tienda.repository;

import java.util.List;

import ar.edu.unq.tac.tienda.domain.Aplicacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AplicacionRepository extends JpaRepository<Aplicacion, Long> {
	
	@Query("select a from Aplicacion a where a.nombre like %?1% or a.descripcion like %?1%")
	List<Aplicacion> buscar(String q);
	
	
}
