package com.team02.u26.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team02.u26.ejercicio4.dao.IFacultadDAO;
import com.team02.u26.ejercicio4.dto.Facultad;

@Service
public class FacultadServiceImpl implements IFacultadService{

	@Autowired
	IFacultadDAO iFacultadDAO;

	@Override
	public List<Facultad> listarFacultad() {
		// TODO Auto-generated method stub
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultad FacultadXID(int codigo) {
		// TODO Auto-generated method stub
		return iFacultadDAO.findById(codigo).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return iFacultadDAO.save(facultad);
	}

	@Override
	public void eliminarFacultad(int codigo) {
		iFacultadDAO.deleteById(codigo);		
	}
}
