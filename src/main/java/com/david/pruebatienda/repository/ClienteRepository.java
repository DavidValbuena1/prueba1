package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.Cliente;

public interface ClienteRepository extends Repository<Cliente, Integer> {
	public List<Cliente> findAll();
	public Cliente save(Cliente c);
	public Cliente findById(int id);
	public Cliente deleteById(int id);
	
	
}
