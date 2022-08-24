package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.TipoIdentificacion;

@org.springframework.stereotype.Repository
public interface TipoIdentificacionRepository extends Repository<TipoIdentificacion, Integer> {
	public List<TipoIdentificacion> findAll();
	public TipoIdentificacion findById(int id);
}
