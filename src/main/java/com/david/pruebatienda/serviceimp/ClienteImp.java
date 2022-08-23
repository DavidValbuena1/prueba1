package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.Cliente;
import com.david.pruebatienda.repository.ClienteRepository;
import com.david.pruebatienda.service.SCliente;


@Component
public class ClienteImp implements SCliente {
	
	@Autowired(required=true)
	private ClienteRepository repositorio;
	
	@Override
	public List<Cliente> listaClientes() {
		return repositorio.findAll();
	}

	@Override
	public Cliente insertarCliente(Cliente c) {
		return repositorio.save(c);
	}

	@Override
	public Cliente editarCliente(Cliente c) {
		return repositorio.save(c);
	}

	@Override
	public Cliente encontrarCliente(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Cliente eliminarCliente(int id) {
		return repositorio.deleteById(id);
	}
	
}
