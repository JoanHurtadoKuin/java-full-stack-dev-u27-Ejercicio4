package com.team02.u26.ejercicio4.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "reserva")
public class Reserva {

	@Id
	@Column(name = "codigo")
	private int codigo;
}
