package com.team02.u26.ejercicio4.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva {

	@Id
	@Column(name = "codigo")
	private int codigo;
	@Column(name = "comienzo")
	private Date comienzo;
	@Column(name = "fin")
	private Date fin;

	@OneToMany
	@JoinColumn(name = "investigadores")
	private Facultad facultad;

	@OneToMany
	@JoinColumn(name = "equipos")
	private Equipos equipos;

	public Reserva() {
	
	}

	public Reserva(int codigo, Date comienzo, Date fin, Facultad facultad, Equipos equipos) {
		this.codigo = codigo;
		this.comienzo = comienzo;
		this.fin = fin;
		this.facultad = facultad;
		this.equipos = equipos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getComienzo() {
		return comienzo;
	}

	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	public Equipos getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipos equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", comienzo=" + comienzo + ", fin=" + fin + ", facultad=" + facultad
				+ ", equipos=" + equipos + "]";
	}
	
}
