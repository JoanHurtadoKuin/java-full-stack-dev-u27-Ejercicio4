package com.foi.u27.ejercicio4.service;

import java.util.List;

import com.foi.u27.ejercicio4.dto.Investigadores;

public interface IInvestigadoresService {
	
	public List<Investigadores> listarInvestigadores();

	public Investigadores guardarInvestigadores(Investigadores investigadores);

	public Investigadores investigadoresXID(String dni);

	public Investigadores actualizarInvestigadores(Investigadores investigadores);

	public void eliminarInvestigadores(String dni);

}
