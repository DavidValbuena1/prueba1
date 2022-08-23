package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.Sucursal;
import com.david.pruebatienda.repository.SucursalRepository;
import com.david.pruebatienda.service.SSucursal;

@Component
public class SucursalImp implements SSucursal{

	@Autowired(required=true)
	private SucursalRepository repositorio;
	
	@Override
	public List<Sucursal> encontrarTodas() {
		return repositorio.findAll();
	}

	@Override
	public Sucursal encontrarPorId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Sucursal insertarSucursal(Sucursal s) {
		return repositorio.save(s);
	}

	@Override
	public Sucursal eliminarSucursal(int id) {
		return repositorio.deleteById(id);
	}

	@Override
	public Sucursal editarSucursal(Sucursal s) {
		return repositorio.save(s);
	}


}
