package com.team02.u26.ejercicio4.service;

import java.util.List;

import com.team02.u26.ejercicio4.dto.Investigadores;

public interface IInvestigadoresService {
	
	public List<Investigadores> listarInvestigadores();

	public Investigadores guardarInvestigadores(Investigadores investigadores);

	public Investigadores InvestigadoresXID(int codigo);

	public Investigadores actualizarInvestigadores(Investigadores investigadores);

	public void eliminarInvestigadores(int codigo);

}
