package ar.edu.unq.tac.tienda.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by frepond on 5/28/14.
 */
@Entity
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "cuenta_aplicacion",
            joinColumns = @JoinColumn(name = "cuenta_id"),
            inverseJoinColumns = @JoinColumn(name = "aplicacion_id"))
    private List<Aplicacion> instaladas;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public List<Aplicacion> getInstaladas() {
        return instaladas;
    }

    public void setInstaladas(List<Aplicacion> instaladas) {
        this.instaladas = instaladas;
    }

}
