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

import com.david.pruebatienda.model.Producto;
import com.david.pruebatienda.service.SProducto;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/Producto"})
public class ProductoController {
	
	@Autowired(required = true)
	private SProducto service;
	
	@GetMapping(path= {"/listar"})
	public List<Producto> listar(){
		return service.obtenerProductos();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public Producto listarId(@PathVariable("id") int id) {
		return service.buscarProducto(id);
	}
	
	@PostMapping(path= {"/agregar"})
	public void agregar(@RequestBody Producto p) {
		service.insertarProducto(p);
	}
	
	@PutMapping(path= {"/editar/{id}"})
	public void editar(@RequestBody Producto p, @PathVariable("id") int id) {
		p.setId(id);
		service.editarProducto(p);
	}
	
	@DeleteMapping(path= {"/eliminar/{id}"})
	public Producto eliminar (@PathVariable("id") int id) {
		return service.borrarProducto(id);
	}
	
	@GetMapping(path = {"/idMaximo"})
	public int encontrarIdMaximo () {
		return service.idMaximoProducto();
	}
}