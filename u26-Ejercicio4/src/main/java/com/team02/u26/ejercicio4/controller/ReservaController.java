package com.team02.u26.ejercicio4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team02.u26.ejercicio4.dto.Reserva;
import com.team02.u26.ejercicio4.service.ReservaServiceImpl;


@RestController
@RequestMapping("/reserva")
public class ReservaController {
	
	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	@GetMapping("/")
	public List<Reserva> listarreserva(){
		return reservaServiceImpl.listarReserva();
	}

	@PostMapping("/")
	public Reserva salvarreserva(@RequestBody Reserva reserva) {
		return reservaServiceImpl.guardarReserva(reserva);
	}
	
	@GetMapping("/{codigo}")
	public Reserva reservaXID(@PathVariable(name="codigo") int codigo) {
		Reserva reserva_xid = new Reserva();
		reserva_xid = reservaServiceImpl.reservaXID(codigo);
		
		return reserva_xid;
	}
	
	@PutMapping("/{codigo}")
	public Reserva actualizarreserva(@PathVariable(name="codigo")int codigo,@RequestBody Reserva reserva) {
		
		Reserva reserva_seleccionado= new Reserva();
		Reserva reserva_actualizado= new Reserva();
		
		reserva_seleccionado= reservaServiceImpl.reservaXID(codigo);
		
		reserva_seleccionado.setComienzo(reserva.getComienzo());
		reserva_seleccionado.setFin(reserva.getFin());

		reserva_actualizado = reservaServiceImpl.actualizarReserva(reserva_seleccionado);
		
		return reserva_actualizado;
	}
	
	@DeleteMapping("/{codigo}")
	public void eliminarreserva(@PathVariable(name="dni") int codigo) {
		reservaServiceImpl.eliminarReserva(codigo);
	}
	
}
