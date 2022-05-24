package com.team02.u26.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team02.u26.ejercicio4.dao.IInvestigadoresDAO;
import com.team02.u26.ejercicio4.dto.Investigadores;

@Service
public class InvestigadoresServiceImpl implements IInvestigadoresService{
	
	@Autowired
	IInvestigadoresDAO iInvestigadoresDAO;

	@Override
	public List<Investigadores> listarInvestigadores() {
		return iInvestigadoresDAO.findAll();
	}

	@Override
	public Investigadores guardarInvestigadores(Investigadores investigadores) {
		return iInvestigadoresDAO.save(investigadores);
	}

	@Override
	public Investigadores investigadoresXID(String dni) {
		return iInvestigadoresDAO.findById(dni).get();
	}

	@Override
	public Investigadores actualizarInvestigadores(Investigadores investigadores) {
		return iInvestigadoresDAO.save(investigadores);
	}

	@Override
	public void eliminarInvestigadores(String dni) {
		iInvestigadoresDAO.deleteById(dni);
	}

}
