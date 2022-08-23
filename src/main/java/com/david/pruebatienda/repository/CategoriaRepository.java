package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.Categoria;

public interface CategoriaRepository extends Repository<Categoria, Integer>{
	public List<Categoria> findAll();
	public Categoria save(Categoria c);
	public Categoria findById(int id);
	public Categoria deleteById(int id);
}
