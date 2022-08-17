package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.Bodega;


public interface BodegaRepository extends Repository<Bodega, Integer> {
	public List<Bodega> findAll();
	public Bodega save(Bodega b);
	public Bodega deleteById(int id);
	public Bodega findById(int id);
}
