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

import com.david.pruebatienda.model.Categoria;
import com.david.pruebatienda.service.SCategoria;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/Categoria"})
public class CategoriaController {
	
	@Autowired(required = true)
	private SCategoria service;
	
	@GetMapping(path={"/listar"})
	public List<Categoria> listaCategorias(){
		return service.listaCategorias();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public Categoria buscarCategoria(@PathVariable("id") int id) {
		return service.buscarCategoria(id);
	}
	
	@PostMapping(path= {"/agregar"})
	public Categoria insertarCategoria(@RequestBody Categoria c) {
		return service.insertarCategoria(c);
	}
	
	@PutMapping(path= {"/editar/{id}"})
	public Categoria editarCategoria(@RequestBody Categoria c, @PathVariable ("id") int id) {
		c.setId(id);
		return service.editarCategoria(c);
	}
	
	@DeleteMapping(path= {"/eliminar/{id}"})
	public Categoria eliminarCategoria(@PathVariable("id") int id) {
		return service.eliminarCategoria(id);
	}
}
