package com.foi.u27.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foi.u27.ejercicio4.dao.IReseravaDAO;
import com.foi.u27.ejercicio4.dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService {

	@Autowired
	IReseravaDAO iReseravaDAO;

	@Override
	public List<Reserva> listarReserva() {
		return iReseravaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva reserva) {
		return iReseravaDAO.save(reserva);
	}

	@Override
	public Reserva reservaXID(int codigo) {
		return iReseravaDAO.findById(codigo).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		return iReseravaDAO.save(reserva);
	}

	@Override
	public void eliminarReserva(int codigo) {
		iReseravaDAO.deleteById(codigo);
	}

}
