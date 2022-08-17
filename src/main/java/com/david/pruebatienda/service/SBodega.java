package com.david.pruebatienda.service;

import java.util.List;

import com.david.pruebatienda.model.Bodega;

public interface SBodega {
	public List<Bodega> buscarTodasBodegas();
	public Bodega insertarBodega(Bodega b);
	public Bodega editarBodega(Bodega b);
	public Bodega eliminarBodega(int id);
	public Bodega buscarBodega(int id);
}
