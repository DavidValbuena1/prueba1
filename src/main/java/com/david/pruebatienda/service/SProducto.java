package com.david.pruebatienda.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.Producto;

@Component
public interface SProducto {
	public List<Producto> obtenerProductos();
	public Producto insertarProducto(Producto p);
	public Producto editarProducto(Producto p);
	public Producto borrarProducto(int id);
	public Producto buscarProducto(int id);
}
