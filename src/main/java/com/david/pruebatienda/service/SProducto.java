package com.david.pruebatienda.service;

import java.util.List;


import com.david.pruebatienda.model.Producto;


public interface SProducto {
	public List<Producto> obtenerProductos();
	public void insertarProducto(Producto p);
	public void editarProducto(Producto p);
	public Producto borrarProducto(int id);
	public Producto buscarProducto(int id);
	
	public int idMaximoProducto();
}
