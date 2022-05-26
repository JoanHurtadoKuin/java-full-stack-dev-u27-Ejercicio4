package com.foi.u27.ejercicio4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foi.u27.ejercicio4.dto.Usuario;


public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}