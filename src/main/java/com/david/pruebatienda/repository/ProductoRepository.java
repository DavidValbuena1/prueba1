package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.Producto;

public interface ProductoRepository extends Repository<Producto,Integer> {
	
	public List<Producto> findAll();
	public Producto findById(int id);
	public void save(Producto p);
	public Producto deleteById(int id);
	
	@Query("SELECT max(p.id) FROM Producto p")
	public int idMaximoProducto();
}
