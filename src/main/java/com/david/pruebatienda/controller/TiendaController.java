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

import com.david.pruebatienda.model.Tienda;
import com.david.pruebatienda.service.STienda;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/Tienda"})
public class TiendaController {
	
	@Autowired(required=true)
	private STienda service;
	
	@GetMapping(path= {"/listar"})
	public List<Tienda> encontrarTodos(){
		return service.encontrarTodos();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public Tienda encontrarPorId(@PathVariable("id") int id) {
		return service.encontrarPorId(id);
	}
	
	@PostMapping(path= {"/agregar"})
	public Tienda insertarTienda(@RequestBody Tienda t) {
		return service.insertarTienda(t);
	}
	
	@PutMapping(path= {"/editar/{id}"})
	public Tienda editarTienda(@RequestBody Tienda t, @PathVariable("id") int id) {
		t.setId(id);
		return service.editarTienda(t);
	}
	
	@DeleteMapping(path= {"/eliminar/{id}"})
	public Tienda eliminarTienda(@PathVariable("id") int id) {
		return service.eliminarTienda(id);
	}
}
