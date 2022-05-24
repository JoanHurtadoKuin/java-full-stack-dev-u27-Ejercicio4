package com.team02.u26.ejercicio4.dto;

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
@Table(name= "investigadores")
public class Investigadores {
	
	//Atributos de entidad investigadores
	
	@Id
	@Column(name = "dni")
	private int dni;
	@Column(name = "nom_apels")
	private String nomApels;

	@OneToMany
	@JoinColumn(name = "num_serie")
	private List<Reserva> reserva;
	
    @ManyToOne
    @JoinColumn(name="codigo")
    private Facultad facultad;


    public Investigadores() {
    
    }
    
	public Investigadores(int dni, String nomApels, Facultad facultad) {
		this.dni = dni;
		this.nomApels = nomApels;
		this.facultad = facultad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
		
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	@Override
	public String toString() {
		return "Investigadores [dni=" + dni + ", nomApels=" + nomApels + ", facultad=" + facultad + "]";
	}
       

}
