package pe.edu.sistemas.asidoc.dao.dominio;

// Generated 26-nov-2016 10:22:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Foto generated by hbm2java
 */
@Entity
@Table(name = "foto")
public class Foto implements java.io.Serializable {

	private int idFoto;
	private Docente docente;
	private String nomRuta;
	private char blEstado;

	public Foto() {
	}

	public Foto(int idFoto, String nomRuta, char blEstado) {
		this.idFoto = idFoto;
		this.nomRuta = nomRuta;
		this.blEstado = blEstado;
	}

	public Foto(int idFoto, Docente docente, String nomRuta, char blEstado) {
		this.idFoto = idFoto;
		this.docente = docente;
		this.nomRuta = nomRuta;
		this.blEstado = blEstado;
	}

	@Id
	@Column(name = "id_foto", unique = true, nullable = false)
	public int getIdFoto() {
		return this.idFoto;
	}

	public void setIdFoto(int idFoto) {
		this.idFoto = idFoto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_docente")
	public Docente getDocente() {
		return this.docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	@Column(name = "nom_ruta", nullable = false, length = 50)
	public String getNomRuta() {
		return this.nomRuta;
	}

	public void setNomRuta(String nomRuta) {
		this.nomRuta = nomRuta;
	}

	@Column(name = "bl_estado", nullable = false, length = 1)
	public char getBlEstado() {
		return this.blEstado;
	}

	public void setBlEstado(char blEstado) {
		this.blEstado = blEstado;
	}

}
