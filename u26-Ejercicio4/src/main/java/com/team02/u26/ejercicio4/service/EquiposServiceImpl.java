package com.team02.u26.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team02.u26.ejercicio4.dao.IEquiposDAO;
import com.team02.u26.ejercicio4.dto.Equipos;

@Service
public class EquiposServiceImpl implements IEquiposService {

	@Autowired
	IEquiposDAO iEquiposDAO;

	@Override
	public List<Equipos> listarEquipos() {
		return iEquiposDAO.findAll();
	}

	@Override
	public Equipos guardarEquipos(Equipos equipos) {
		return iEquiposDAO.save(equipos);
	}

	@Override
	public Equipos equiposXID(String numSerie) {
		return iEquiposDAO.findById(numSerie).get();
	}

	@Override
	public Equipos actualizarEquipos(Equipos equipos) {
		return iEquiposDAO.save(equipos);
	}

	@Override
	public void eliminarEquipos(String numSerie) {
		iEquiposDAO.deleteById(numSerie);
	}

}
