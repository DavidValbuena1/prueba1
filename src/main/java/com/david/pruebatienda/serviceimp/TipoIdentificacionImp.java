package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.TipoIdentificacion;
import com.david.pruebatienda.repository.TipoIdentificacionRepository;
import com.david.pruebatienda.service.STipoIdentificacion;

@Component
public class TipoIdentificacionImp implements STipoIdentificacion {

	@Autowired(required=true)
	private TipoIdentificacionRepository service;
	
	@Override
	public List<TipoIdentificacion> encontrarTodos() {
		return service.findAll();
	}

	@Override
	public TipoIdentificacion encontrarPorId(int id) {
		return service.findById(id);
	}

}
