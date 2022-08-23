package com.david.pruebatienda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.david.pruebatienda.model.Rol;

@Service
public interface SRol {
	public List<Rol> encontrarTodos();
	public Rol encontrarPorId(int id);
	
}
