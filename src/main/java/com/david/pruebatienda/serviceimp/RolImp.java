package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.Rol;
import com.david.pruebatienda.repository.RolRepository;
import com.david.pruebatienda.service.SRol;

@Component
public class RolImp implements SRol {
	
	@Autowired(required=true)
	private RolRepository repositorio;
	@Override
	public List<Rol> encontrarTodos() {
		return repositorio.findAll();
	}

	@Override
	public Rol encontrarPorId(int id) {
		return repositorio.findById(id);
	}
	
}
