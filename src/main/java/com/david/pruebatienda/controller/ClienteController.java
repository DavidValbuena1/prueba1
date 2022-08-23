package com.david.pruebatienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.pruebatienda.model.Cliente;
import com.david.pruebatienda.service.SCliente;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/Cliente"})
public class ClienteController {
	@Autowired(required=true)
	private SCliente service;
	
	@GetMapping(path= {"/listar"})
	public List<Cliente> listaClientes(){
		return service.listaClientes();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public Cliente encontrarCliente(@PathVariable("id") int id) {
		return service.encontrarCliente(id);
	}
	
	@PostMapping(path= {"/agregar"})
	public Cliente insertarCliente(@RequestBody Cliente c) {
		return service.insertarCliente(c);
	}
	
	@PutMapping(path= {"/editar/{id}"})
	public Cliente editarCliente(@RequestBody Cliente c, @PathVariable("id") int id) {
		c.setId(id);
		return service.editarCliente(c);
	}
	
	@DeleteMapping(path={"/eliminar/{id}"})
	public Cliente eliminarCliente(@PathVariable ("id") int id) {
		return service.eliminarCliente(id);
	}
}
