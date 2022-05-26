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

import com.foi.u27.ejercicio4.dto.Investigadores;
import com.foi.u27.ejercicio4.service.InvestigadoresServiceImpl;


@RestController
@RequestMapping("/investigadores")
public class InvestigadoresController {
	
	@Autowired
	InvestigadoresServiceImpl investigadoresServiceImpl;
	
	@GetMapping("/")
	public List<Investigadores> listarinvestigadores(){
		return investigadoresServiceImpl.listarInvestigadores();
	}

	@PostMapping("/")
	public Investigadores salvarinvestigadores(@RequestBody Investigadores investigadores) {
		return investigadoresServiceImpl.guardarInvestigadores(investigadores);
	}
	
	@GetMapping("/{dni}")
	public Investigadores investigadoresXID(@PathVariable(name="dni") String dni) {
		Investigadores investigadores_xid = new Investigadores();
		investigadores_xid = investigadoresServiceImpl.investigadoresXID(dni);
		
		return investigadores_xid;
	}
	
	@PutMapping("/{dni}")
	public Investigadores actualizarinvestigadores(@PathVariable(name="dni")String dni,@RequestBody Investigadores investigadores) {
		
		Investigadores investigadores_seleccionado= new Investigadores();
		Investigadores investigadores_actualizado= new Investigadores();
		
		investigadores_seleccionado= investigadoresServiceImpl.investigadoresXID(dni);
		
		investigadores_seleccionado.setNomApels(investigadores.getNomApels());
		investigadores_seleccionado.setFacultad(investigadores.getFacultad());

		investigadores_actualizado = investigadoresServiceImpl.actualizarInvestigadores(investigadores_seleccionado);
		
		return investigadores_actualizado;
	}
	
	@DeleteMapping("/{dni}")
	public void eliminarinvestigadores(@PathVariable(name="dni") String dni) {
		investigadoresServiceImpl.eliminarInvestigadores(dni);
	}
	
}
