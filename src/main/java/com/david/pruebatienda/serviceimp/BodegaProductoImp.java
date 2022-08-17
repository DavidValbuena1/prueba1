package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.BodegaProducto;
import com.david.pruebatienda.repository.BodegaProductoRepository;
import com.david.pruebatienda.service.SBodegaProducto;

@Component
public class BodegaProductoImp implements SBodegaProducto{
	
	@Autowired(required=true)
	public BodegaProductoRepository repositorio;
	
	@Override
	public List<BodegaProducto> listaBodegasProductos() {
		return repositorio.findAll();
	}

	@Override
	public BodegaProducto insertar(BodegaProducto bp) {
		return repositorio.save(bp);
	}

	@Override
	public BodegaProducto editar(BodegaProducto bp) {
		return repositorio.save(bp);
	}

	@Override
	public BodegaProducto eliminar(int id) {
		return repositorio.deleteById(id);
	}

	@Override
	public List<BodegaProducto> buscarPorProducto(int id) {
		return repositorio.buscarPorProducto(id);
	}

	@Override
	public List<BodegaProducto> buscarPorBodega(int id) {
		return repositorio.buscarPorBodega(id);
	}

}
