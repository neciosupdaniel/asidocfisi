package pe.edu.sistemas.asidoc.dao.dominio;

// Generated 26-nov-2016 10:22:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Horario generated by hbm2java
 */
@Entity
@Table(name = "horario", schema = "dbasidoc")
public class Horario implements java.io.Serializable {

	private int idHorario;
	private String nomDia;
	private Date hoInicio;
	private Date hoFin;

	public Horario() {
	}

	public Horario(int idHorario, String nomDia, Date hoInicio, Date hoFin) {
		this.idHorario = idHorario;
		this.nomDia = nomDia;
		this.hoInicio = hoInicio;
		this.hoFin = hoFin;
	}

	@Id
	@Column(name = "id_horario", unique = true, nullable = false)
	public int getIdHorario() {
		return this.idHorario;
	}

	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}

	@Column(name = "nom_dia", nullable = false, length = 15)
	public String getNomDia() {
		return this.nomDia;
	}

	public void setNomDia(String nomDia) {
		this.nomDia = nomDia;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "ho_inicio", nullable = false, length = 15)
	public Date getHoInicio() {
		return this.hoInicio;
	}

	public void setHoInicio(Date hoInicio) {
		this.hoInicio = hoInicio;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "ho_fin", nullable = false, length = 15)
	public Date getHoFin() {
		return this.hoFin;
	}

	public void setHoFin(Date hoFin) {
		this.hoFin = hoFin;
	}
}
