package ar.edu.unq.tac.tienda.init;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Inicializa la app
 * 
 * @author fgarcia
 */
@Component
public class AppInitializator {

	@Autowired
	private InitDatabase applicationDataInit;

	@PostConstruct
	public void init() {
		applicationDataInit.crearAplicaciones(100);
        applicationDataInit.crearCuentas(10);
	}

}
