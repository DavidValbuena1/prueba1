package com.david.pruebatienda.service;

import java.util.List;

import com.david.pruebatienda.model.Cliente;

public interface SCliente {
	public List<Cliente> listaClientes();
	public Cliente insertarCliente(Cliente c);
	public Cliente editarCliente(Cliente c);
	public Cliente encontrarCliente(int id);
	public Cliente eliminarCliente(int id);
}
