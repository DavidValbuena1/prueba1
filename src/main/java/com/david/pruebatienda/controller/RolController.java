package com.david.pruebatienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.pruebatienda.model.Rol;
import com.david.pruebatienda.service.SRol;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/Rol"})
public class RolController {
	
	@Autowired(required=true)
	private SRol service;
	
	@GetMapping(path= {"/listar"})
	public List<Rol> encontrarTodos(){
		return service.encontrarTodos();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public Rol encontrarPorId(@PathVariable("id") int id) {
		return service.encontrarPorId(id);
	}
}
