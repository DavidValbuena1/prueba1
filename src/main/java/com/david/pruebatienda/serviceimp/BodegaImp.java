package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.Bodega;
import com.david.pruebatienda.repository.BodegaRepository;
import com.david.pruebatienda.service.SBodega;

@Component
public class BodegaImp implements SBodega{
	
	@Autowired(required=true)
	public BodegaRepository repositorio;

	@Override
	public List<Bodega> buscarTodasBodegas() {
		return repositorio.findAll();
	}

	@Override
	public Bodega insertarBodega(Bodega b) {
		return repositorio.save(b);
	}

	@Override
	public Bodega editarBodega(Bodega b) {
		return repositorio.save(b);
	}

	@Override
	public Bodega eliminarBodega(int id) {
		return repositorio.deleteById(id);
	}

	@Override
	public Bodega buscarBodega(int id) {
		return repositorio.findById(id);
	}

}
