package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.Producto;
import com.david.pruebatienda.repository.ProductoRepository;
import com.david.pruebatienda.service.SProducto;

@Component
public class ProductoImp implements SProducto {
	
	@Autowired(required = true)
	private ProductoRepository service;
	
	@Override
	public List<Producto> obtenerProductos() {
		return service.findAll();
	}

	@Override
	public Producto insertarProducto(Producto p) {
		return service.save(p);
	}

	@Override
	public Producto editarProducto(Producto p) {
		return service.save(p);
	}

	@Override
	public Producto borrarProducto(int id) {
		return service.deleteById(id);
	}

	@Override
	public Producto buscarProducto(int id) {
		return service.findById(id);
	}

	@Override
	public int idMaximoProducto() {
		return (int) service.idMaximoProducto();
	}

}
