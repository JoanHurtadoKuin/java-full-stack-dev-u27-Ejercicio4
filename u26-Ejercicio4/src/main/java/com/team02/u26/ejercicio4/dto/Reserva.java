package com.team02.u26.ejercicio4.dto;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@ManyToOne
	@JoinColumn(name = "dni")
	private Investigadores investigadores;

	@ManyToOne
	@JoinColumn(name = "num_serie")
	private Equipos equipos;

	public Reserva() {
	
	}

	public Reserva(int codigo, Date comienzo, Date fin, Investigadores investigadores, Equipos equipos) {
		this.codigo = codigo;
		this.comienzo = comienzo;
		this.fin = fin;
		this.investigadores = investigadores;
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


	public Investigadores getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(Investigadores investigadores) {
		this.investigadores = investigadores;
	}

	public Equipos getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipos equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", comienzo=" + comienzo + ", fin=" + fin + ", facultad=" + investigadores
				+ ", equipos=" + equipos + "]";
	}
	
}
