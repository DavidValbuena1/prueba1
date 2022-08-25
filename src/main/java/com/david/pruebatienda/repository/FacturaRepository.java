package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.Factura;

public interface FacturaRepository extends Repository<Factura, Integer> {
	
	public List<Factura> findAll();
	public Factura save(Factura f);
	public Factura findById(int id);
	public Factura deleteById(int id);
	
	@Query("SELECT Max(f.id) FROM Factura f")
	public int count();
}
