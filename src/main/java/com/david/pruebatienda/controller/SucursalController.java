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

import com.david.pruebatienda.model.Sucursal;
import com.david.pruebatienda.service.SSucursal;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/Sucursal"})
public class SucursalController {
	
	@Autowired(required=true)
	private SSucursal service;
	
	@GetMapping(path= {"/listar"})
	public List<Sucursal> encontrarTodos(){
		return service.encontrarTodas();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public Sucursal encontrarPorId(@PathVariable("id") int id) {
		return service.encontrarPorId(id);
	}
	
	@PostMapping(path= {"/agregar"})
	public Sucursal insertarSucursal(@RequestBody Sucursal s) {
		return service.insertarSucursal(s);
	}
	
	@PutMapping(path= {"/editar/{id}"})
	public Sucursal editarSucursal(@PathVariable("id") int id, @RequestBody Sucursal s) {
		s.setId(id);
		return service.editarSucursal(s);
	}
	
	@DeleteMapping(path= {"/eliminar/{id}"})
	public Sucursal eliminarSucursal(@PathVariable("id") int id) {
		return service.eliminarSucursal(id);
	}
}
