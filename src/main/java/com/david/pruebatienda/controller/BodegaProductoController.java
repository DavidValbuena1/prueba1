package com.david.pruebatienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.pruebatienda.model.BodegaProducto;
import com.david.pruebatienda.service.SBodegaProducto;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/BodegaProducto"})
public class BodegaProductoController {
	@Autowired(required=true)
	private SBodegaProducto service;
	
	@GetMapping(path= {"/listar"})
	public List<BodegaProducto> listar(){
		return service.listaBodegasProductos();
	}
	
	@GetMapping(path= {"/listarPorBodega/{id}"})
	public List<BodegaProducto> buscarPorBodega(@PathVariable("id") int id) {
		return service.buscarPorBodega(id);
	}
	
	@GetMapping(path= {"/listarPorProducto/{id}"})
	public List<BodegaProducto> buscarPorProducto(@PathVariable("id") int id) {
		return service.buscarPorProducto(id);
	}
	
	@PostMapping(path= {"/agregar"})
	public BodegaProducto insertar(@RequestBody BodegaProducto bp) {
		return service.insertar(bp);
	}
	
}
