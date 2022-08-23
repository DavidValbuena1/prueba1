package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.Tienda;

public interface TiendaRepository extends Repository<Tienda, Integer> {
	public List<Tienda> findAll();
	public Tienda findById(int id);
	public Tienda save(Tienda t);
	public Tienda deleteById(int id);
}
