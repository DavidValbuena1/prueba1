package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.Proveedor;
import com.david.pruebatienda.repository.ProveedorRepository;
import com.david.pruebatienda.service.SProveedor;

@Component
public class ProveedorImp implements SProveedor {

	@Autowired(required=true)
	private ProveedorRepository repositorio;
	
	@Override
	public List<Proveedor> encontrarProveedores() {
		return repositorio.findAll();
	}

	@Override
	public Proveedor insertarProveedor(Proveedor p) {
		return repositorio.save(p);
	}

	@Override
	public Proveedor editarProveedor(Proveedor p) {
		return repositorio.save(p);
	}

	@Override
	public Proveedor eliminarProveedor(int id) {
		return repositorio.deleteById(id);
	}

	@Override
	public Proveedor buscarPorId(int id) {
		return repositorio.findById(id);
	}

}
