package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.Producto;

public interface ProductoRepository extends Repository<Producto,Integer> {
	
	public List<Producto> findAll();
	public Producto findById(int id);
	public Producto save(Producto p);
	public Producto deleteById(int id);
}
