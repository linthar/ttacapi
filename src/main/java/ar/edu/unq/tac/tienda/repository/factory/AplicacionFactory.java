package ar.edu.unq.tac.tienda.repository.factory;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.tac.tienda.domain.Aplicacion;
import ar.edu.unq.tac.tienda.domain.Categoria;

public class AplicacionFactory {

	public static List<Aplicacion> getListAplicaciones(int cantidad) {

		List<Aplicacion> list = new ArrayList<Aplicacion>(cantidad);

		for (int i = 0; i < cantidad; i++) {
			Aplicacion app = new Aplicacion();
			app.setNombre("App_" + i);
			app.setDescripcion("Esta es la descripcion de la app "+ i);
			app.setVersionActual(String.valueOf(i));
			app.setCategoria(Categoria.TIEMPO_LIBRE);
			list.add(app);
		}
		return list;
	}

	
	
}
