package com.foi.u27.ejercicio4.service;

import java.util.List;

import com.foi.u27.ejercicio4.dto.Reserva;

public interface IReservaService {
	public List<Reserva> listarReserva();

	public Reserva guardarReserva(Reserva reserva);

	public Reserva reservaXID(int codigo);

	public Reserva actualizarReserva(Reserva reserva);

	public void eliminarReserva(int codigo);
}
