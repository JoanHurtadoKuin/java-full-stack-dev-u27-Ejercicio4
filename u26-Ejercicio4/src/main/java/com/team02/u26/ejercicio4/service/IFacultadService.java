package com.team02.u26.ejercicio4.service;

import java.util.List;

import com.team02.u26.ejercicio4.dto.Facultad;


public interface IFacultadService {
	
	public List<Facultad> listarFacultad();

	public Facultad guardarFacultad(Facultad facultad);

	public Facultad FacultadXID(int codigo);

	public Facultad actualizarFacultad(Facultad facultad);

	public void eliminarFacultad(int codigo);

}
