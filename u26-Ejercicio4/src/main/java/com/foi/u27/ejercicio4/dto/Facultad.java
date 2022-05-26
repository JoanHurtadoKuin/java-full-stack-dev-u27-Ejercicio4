package com.foi.u27.ejercicio4.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "facultad")
public class Facultad {
	
	//Atributos de entidad facultad
	@Id
	private int codigo;
	@Column(name = "nombre")
	private String nombre;

	
    @OneToMany
    @JoinColumn(name="num_serie")
    private List<Equipos> equipos;
    
    @OneToMany
    @JoinColumn(name="dni")
    private List<Investigadores> investigadores;

	public Facultad() {

	}
    
	public Facultad(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Equipos")
	public List<Equipos> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipos> equipos) {
		this.equipos = equipos;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigadores")
	public List<Investigadores> getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(List<Investigadores> investigadores) {
		this.investigadores = investigadores;
	}

	@Override
	public String toString() {
		return "Facultad [codigo=" + codigo + ", nombre=" + nombre + "]";
	}




}
