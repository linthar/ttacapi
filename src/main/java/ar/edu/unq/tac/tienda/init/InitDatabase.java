package ar.edu.unq.tac.tienda.init;

import ar.edu.unq.tac.tienda.domain.Cuenta;
import ar.edu.unq.tac.tienda.repository.AplicacionRepository;
import ar.edu.unq.tac.tienda.repository.CuentaRepository;
import ar.edu.unq.tac.tienda.repository.factory.AplicacionFactory;
import ar.edu.unq.tac.tienda.repository.factory.CuentaFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Inicializa la DB
 *
 * @author fgarcia
 */
@Component
public class InitDatabase {

    @Autowired
    private AplicacionRepository aplicacionRepository;
    @Autowired
    private CuentaRepository cuentaRepository;

    public void crearAplicaciones(int cantidad) {
        aplicacionRepository.save(AplicacionFactory
                .getListAplicaciones(cantidad));
    }

    public void crearCuentas(int cantidad) {
        List<Cuenta> cuentas = CuentaFactory.getListCuentas(cantidad);

        cuentaRepository.save(cuentas);
    }

}
