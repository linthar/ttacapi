package ar.edu.unq.tac.tienda.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Aplicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
        
	private String nombre;

	@Enumerated(value = EnumType.STRING)
	private Categoria categoria;

	private String descripcion;

	private Integer ranking;

	private String versionActual;

	// URL del archivo a descargar de la App
	private String archivoApp;

	// URL del icono de la App
	private String icono;

	// URLs de las imagenes
	private String imagenes;

	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public String getVersionActual() {
		return versionActual;
	}

	public void setVersionActual(String versionActual) {
		this.versionActual = versionActual;
	}

	public String getArchivoApp() {
		return archivoApp;
	}

	public void setArchivoApp(String archivoApp) {
		this.archivoApp = archivoApp;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getImagenes() {
		return imagenes;
	}

	public void setImagenes(String imagenes) {
		this.imagenes = imagenes;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" id= ");
		sb.append(id);
		sb.append(" nombre= ");
		sb.append(nombre);
		return sb.toString();
	}
}
