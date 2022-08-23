package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.Borrador;


public interface BorradorRepository extends Repository<Borrador, Integer> {
	public List<Borrador> findAll();
	public Borrador save(Borrador b);
	public Borrador findById(int id);
	public Borrador deleteById(int id);
}
