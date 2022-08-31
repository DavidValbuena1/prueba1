package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.Categoria;
import com.david.pruebatienda.repository.CategoriaRepository;
import com.david.pruebatienda.service.SCategoria;

@Component
public class CategoriaImp implements SCategoria {

	@Autowired(required=true)
	private CategoriaRepository repositorio;
	
	@Override
	public List<Categoria> listaCategorias() {
		return repositorio.findAll();
	}

	@Override
	public Categoria insertarCategoria(Categoria c) {
		return repositorio.save(c);
	}

	@Override
	public Categoria editarCategoria(Categoria c) {
		return repositorio.save(c);
	}

	@Override
	public Categoria buscarCategoria(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Categoria eliminarCategoria(int id) {
		return repositorio.deleteById(id);
	}

	@Override
	public List<Categoria> insertarMultiplesCategorias(List<Categoria> c) {
		return repositorio.saveAll(c);
	}
	
}
