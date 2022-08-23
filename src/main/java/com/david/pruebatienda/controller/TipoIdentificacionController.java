package com.david.pruebatienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.pruebatienda.model.TipoIdentificacion;
import com.david.pruebatienda.service.STipoIdentificacion;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/TipoIdentificacion"})
public class TipoIdentificacionController {
	
	@Autowired(required=true)
	private STipoIdentificacion service;
	
	@GetMapping(path = {"/listar"})
	public List<TipoIdentificacion> encontrarTodos(){
		return service.encontrarTodos();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public TipoIdentificacion encontrarPorId(@PathVariable("id") int id) {
		return service.encontrarPorId(id);
	}
}
