package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.Proveedor;

public interface ProveedorRepository extends Repository<Proveedor, Integer> {
	public List<Proveedor> findAll();
	public Proveedor save(Proveedor p);
	public Proveedor deleteById(int id);
	public Proveedor findById(int id);
}
