package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.david.pruebatienda.model.Tienda;
import com.david.pruebatienda.repository.TiendaRepository;
import com.david.pruebatienda.service.STienda;

public class TiendaImp implements STienda{

	@Autowired(required=true)
	private TiendaRepository repositorio;
	
	@Override
	public List<Tienda> encontrarTodos() {
		return repositorio.findAll();
	}

	@Override
	public Tienda encontrarPorId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Tienda insertarTienda(Tienda t) {
		return repositorio.save(t);
	}

	@Override
	public Tienda editarTienda(Tienda t) {
		return repositorio.save(t);
	}

	@Override
	public Tienda eliminarTienda(int id) {
		return repositorio.deleteById(id);
	}

}
