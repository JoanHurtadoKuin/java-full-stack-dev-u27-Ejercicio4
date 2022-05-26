package com.foi.u27.ejercicio4.service;

import java.util.List;

import com.foi.u27.ejercicio4.dto.Facultad;


public interface IFacultadService {
	
	public List<Facultad> listarFacultad();

	public Facultad guardarFacultad(Facultad facultad);

	public Facultad facultadXID(int codigo);

	public Facultad actualizarFacultad(Facultad facultad);

	public void eliminarFacultad(int codigo);

}
