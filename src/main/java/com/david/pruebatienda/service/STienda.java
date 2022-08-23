package com.david.pruebatienda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.david.pruebatienda.model.Tienda;

@Service
public interface STienda {
	public List<Tienda> encontrarTodos();
	public Tienda encontrarPorId(int id);
	public Tienda insertarTienda(Tienda t);
	public Tienda editarTienda(Tienda t);
	public Tienda eliminarTienda(int id);
}
