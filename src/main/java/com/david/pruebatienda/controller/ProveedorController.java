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

import com.david.pruebatienda.model.Proveedor;
import com.david.pruebatienda.service.SProveedor;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/Proveedor"})
public class ProveedorController {
	
	@Autowired(required=true)
	private SProveedor service;
	
	@GetMapping(path= {"/listar"})
	public List<Proveedor> listar(){
		return service.encontrarProveedores();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public Proveedor encontrarPorId(@PathVariable("id") int id) {
		return service.buscarPorId(id);
	}
	
	@PostMapping(path= {"/agregar"})
	public Proveedor insertar(@RequestBody Proveedor p) {
		return service.insertarProveedor(p);
	}
	
	@PutMapping(path= {"/editar/{id}"})
	public Proveedor editar(@RequestBody Proveedor p, @PathVariable("id") int id) {
		return service.editarProveedor(p);
	}
	
	@DeleteMapping(path = {"/eliminar/{id}"})
	public Proveedor eliminar(@PathVariable("id") int id) {
		return service.eliminarProveedor(id);
	}
}
