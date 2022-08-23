package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.TipoIdentificacion;
import com.david.pruebatienda.service.STipoIdentificacion;

@Component
public class TipoIdentificacionImp implements STipoIdentificacion {

	@Autowired(required=true)
	private STipoIdentificacion service;
	
	@Override
	public List<TipoIdentificacion> encontrarTodos() {
		return service.encontrarTodos();
	}

	@Override
	public TipoIdentificacion encontrarPorId(int id) {
		return service.encontrarPorId(id);
	}

}
