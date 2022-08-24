package com.david.pruebatienda.service;

import java.util.List;


import com.david.pruebatienda.model.TipoIdentificacion;

public interface STipoIdentificacion {
	public List<TipoIdentificacion> encontrarTodos();
	public TipoIdentificacion encontrarPorId(int id);
}
