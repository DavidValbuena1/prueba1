package com.david.pruebatienda.service;

import java.util.List;

import com.david.pruebatienda.model.Categoria;

public interface SCategoria {
	public List<Categoria> listaCategorias();
	public Categoria insertarCategoria(Categoria c);
	public Categoria editarCategoria(Categoria c);
	public Categoria buscarCategoria(int id);
	public Categoria eliminarCategoria(int id);
	public List<Categoria> insertarMultiplesCategorias(List<Categoria> c);
}
