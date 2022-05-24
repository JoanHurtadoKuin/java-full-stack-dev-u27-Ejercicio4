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

import com.team02.u26.ejercicio4.dto.Facultad;
import com.team02.u26.ejercicio4.service.FacultadServiceImpl;


@RestController
@RequestMapping("/facultad")
public class FacultadController {
	
	@Autowired
	FacultadServiceImpl facultadServiceImpl;
	
	@GetMapping("/")
	public List<Facultad> listarfacultad(){
		return facultadServiceImpl.listarFacultad();
	}

	@PostMapping("/")
	public Facultad salvarfacultad(@RequestBody Facultad facultad) {
		return facultadServiceImpl.guardarFacultad(facultad);
	}
	
	@GetMapping("/{codigo}")
	public Facultad facultadXID(@PathVariable(name="codigo") int codigo) {
		Facultad facultad_xid = new Facultad();
		facultad_xid = facultadServiceImpl.facultadXID(codigo);
		
		return facultad_xid;
	}
	
	@PutMapping("/{codigo}")
	public Facultad actualizarfacultad(@PathVariable(name="codigo")int codigo,@RequestBody Facultad facultad) {
		
		Facultad facultad_seleccionado= new Facultad();
		Facultad facultad_actualizado= new Facultad();
		
		facultad_seleccionado= facultadServiceImpl.facultadXID(codigo);
		
		facultad_seleccionado.setNombre(facultad.getNombre());

		facultad_actualizado = facultadServiceImpl.actualizarFacultad(facultad_seleccionado);
		
		return facultad_actualizado;
	}
	
	@DeleteMapping("/{codigo}")
	public void eliminarfacultad(@PathVariable(name="dni") int codigo) {
		facultadServiceImpl.eliminarFacultad(codigo);
	}
	
}
