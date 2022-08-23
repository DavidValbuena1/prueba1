package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.Sucursal;

public interface SucursalRepository extends Repository<Sucursal, Integer> {
	public List<Sucursal> findAll();
	public Sucursal findById(int id);
	public Sucursal save(Sucursal s);
	public Sucursal deleteById(int id);
}
