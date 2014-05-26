package ar.edu.unq.tac.tienda.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.edu.unq.tac.tienda.repository.AplicacionRepository;
import ar.edu.unq.tac.tienda.repository.factory.AplicacionFactory;

/**
 * Inicializa la DB
 * 
 * @author fgarcia
 */
@Component
public class InitDatabase {

	@Autowired
	private AplicacionRepository aplicacionRepository;

	public void crearAplicaciones(int cantidad) {
		aplicacionRepository.save(AplicacionFactory
				.getListAplicaciones(cantidad));
	}

}
