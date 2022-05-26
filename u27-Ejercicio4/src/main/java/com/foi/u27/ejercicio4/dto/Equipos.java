package com.foi.u27.ejercicio4.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "equipos")
public class Equipos {

	//Atributos de entidad equipos
	
	@Id
	@Column(name = "num_serie")
	private String numSerie;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "num_serie")
	private List<Reserva> reserva;
	
    @ManyToOne
    @JoinColumn(name="codigo")
    private Facultad facultad;

    
	public Equipos() {

	}

	public Equipos(String numSerie, String nombre, Facultad facultad) {
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.facultad = facultad;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	@Override
	public String toString() {
		return "Equipos [numSerie=" + numSerie + ", nombre=" + nombre + ", facultad=" + facultad + "]";
	}    
    
}
