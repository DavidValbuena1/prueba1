package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.Rol;

public interface RolRepository extends Repository<Rol, Integer> {
	public List<Rol> findAll();
	public Rol findById(int id);
}
