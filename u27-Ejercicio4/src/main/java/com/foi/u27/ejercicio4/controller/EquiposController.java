package com.foi.u27.ejercicio4.controller;

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

import com.foi.u27.ejercicio4.dto.Equipos;
import com.foi.u27.ejercicio4.service.EquiposServiceImpl;


@RestController
@RequestMapping("/equipos")
public class EquiposController {
	
	@Autowired
	EquiposServiceImpl equiposServiceImpl;
	
	@GetMapping("/")
	public List<Equipos> listarEquipos(){
		return equiposServiceImpl.listarEquipos();
	}

	@PostMapping("/")
	public Equipos salvarEquipos(@RequestBody Equipos equipos) {
		return equiposServiceImpl.guardarEquipos(equipos);
	}
	
	@GetMapping("/{num_serie}")
	public Equipos EquiposXID(@PathVariable(name="num_serie") String numSerie) {
		Equipos equipos_xid = new Equipos();
		equipos_xid = equiposServiceImpl.equiposXID(numSerie);
		
		return equipos_xid;
	}
	
	@PutMapping("/{num_serie}")
	public Equipos actualizarEquipos(@PathVariable(name="num_serie")String numSerie,@RequestBody Equipos equipos) {
		
		Equipos equipos_seleccionado= new Equipos();
		Equipos equipos_actualizado= new Equipos();
		
		equipos_seleccionado= equiposServiceImpl.equiposXID(numSerie);
		
		equipos_seleccionado.setNombre(equipos.getNombre());
		equipos_seleccionado.setFacultad(equipos.getFacultad());

		equipos_actualizado = equiposServiceImpl.actualizarEquipos(equipos_seleccionado);
		
		return equipos_actualizado;
	}
	
	@DeleteMapping("/{num_serie}")
	public void eliminarEquipos(@PathVariable(name="num_serie") String numSerie) {
		equiposServiceImpl.eliminarEquipos(numSerie);
	}
	
}
