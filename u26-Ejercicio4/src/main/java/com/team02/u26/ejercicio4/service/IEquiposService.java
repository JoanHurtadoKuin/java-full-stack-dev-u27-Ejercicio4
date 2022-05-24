package com.team02.u26.ejercicio4.service;

import java.util.List;

import com.team02.u26.ejercicio4.dto.Equipos;

public interface IEquiposService {
	
	public List<Equipos> listarEquipos();

	public Equipos guardarEquipos(Equipos equipos);

	public Equipos equiposXID(String numSerie);

	public Equipos actualizarEquipos(Equipos equipos);

	public void eliminarEquipos(String numSerie);

}
