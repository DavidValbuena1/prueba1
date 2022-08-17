package com.david.pruebatienda.service;

import java.util.List;

import com.david.pruebatienda.model.BodegaProducto;

public interface SBodegaProducto {
	public List<BodegaProducto> listaBodegasProductos();
	public BodegaProducto insertar(BodegaProducto bp);
	public BodegaProducto editar(BodegaProducto bp);
	public BodegaProducto eliminar(int id);
	
	
	public List<BodegaProducto> buscarPorProducto(int id);
	public List<BodegaProducto> buscarPorBodega(int id);
}
