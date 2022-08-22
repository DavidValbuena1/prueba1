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

import com.david.pruebatienda.model.Factura;
import com.david.pruebatienda.service.SFactura;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/Factura"})
public class FacturaController {
	
	@Autowired(required=true)
	private SFactura service;
	
	@GetMapping(path= {"/listar"})
	public List<Factura> listar(){
		return service.encontrarFacturas();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public Factura encontrarFactura(@PathVariable("id") int id) {
		return service.buscarFactura(id);
	}
	
	@GetMapping(path= {"/contar"})
	public int contar() {
		return (int) service.contar();
	}
	
	@PostMapping(path= {"/agregar"})
	public Factura insertar(@RequestBody Factura f) {
		return service.insertarFactura(f);
	}
	
	@PutMapping(path= {"/editar/{id}"})
	public Factura editar(@RequestBody Factura f, @PathVariable("id") int id) {
		f.setId(id);
		return service.editarFactura(f);
	}
	
	@DeleteMapping(path= {"/eliminar/{id}"})
	public Factura eliminar(@PathVariable("id") int id) {
		return service.eliminarFactura(id);
	}
}
