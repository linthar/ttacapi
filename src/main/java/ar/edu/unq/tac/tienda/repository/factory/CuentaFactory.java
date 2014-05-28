package ar.edu.unq.tac.tienda.repository.factory;

import ar.edu.unq.tac.tienda.domain.Aplicacion;
import ar.edu.unq.tac.tienda.domain.Categoria;
import ar.edu.unq.tac.tienda.domain.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class CuentaFactory {

    public static List<Cuenta> getListCuentas(int cantidad) {
        List<Cuenta> list = new ArrayList<Cuenta>(cantidad);

        for (int i = 0; i < cantidad; i++) {
            List<Aplicacion> apps = AplicacionFactory.getListAplicaciones(5);

            Cuenta cuenta = new Cuenta();

            cuenta.setDescripcion("Acc_" + i);
            cuenta.setInstaladas(apps);
            list.add(cuenta);
        }

        return list;
    }


}
