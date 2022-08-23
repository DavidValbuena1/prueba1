package com.david.pruebatienda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.david.pruebatienda.model.TipoIdentificacion;

@Service
public interface STipoIdentificacion {
	public List<TipoIdentificacion> encontrarTodos();
	public TipoIdentificacion encontrarPorId(int id);
}
