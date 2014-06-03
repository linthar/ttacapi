package ar.edu.unq.tac.tienda.repository.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ar.edu.unq.tac.tienda.domain.Aplicacion;
import ar.edu.unq.tac.tienda.domain.Categoria;

public class AplicacionFactory {

	public static List<Aplicacion> getListAplicaciones(String namePrefix, int cantidad) {

		List<Aplicacion> list = new ArrayList<Aplicacion>(cantidad);
		Random random = new Random();
		
		
		for (int i = cantidad; i > 0; i--) {
			Aplicacion app = new Aplicacion();
			app.setNombre(namePrefix+" - App " + i);
			app.setDescripcion("Esta es la descripcion de la app "+ i);
			app.setVersionActual(String.valueOf(i));
			app.setCategoria(Categoria.TIEMPO_LIBRE);
			app.setRanking(random.nextInt(6));
			list.add(app);
		}
		return list;
	}

	
	
}
