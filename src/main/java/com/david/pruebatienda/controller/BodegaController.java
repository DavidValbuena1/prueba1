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

import com.david.pruebatienda.model.Bodega;
import com.david.pruebatienda.service.SBodega;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/Bodega"})
public class BodegaController {
	
	@Autowired(required=true)
	public SBodega service;
	
	@GetMapping(path= {"/listar"})
	public List<Bodega> listaBodegas(){
		return service.buscarTodasBodegas();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public Bodega encontrarBodega(@PathVariable ("id") int id) {
		return service.buscarBodega(id);
	}
	
	@PostMapping(path= {"/agregar"})
	public Bodega insertarBodega(@RequestBody Bodega b) {
		return service.insertarBodega(b);
	}
	
	@PutMapping(path= {"/editar/{id}"})
	public Bodega editarBodega(@PathVariable ("id") int id, @RequestBody Bodega b) {
		b.setId(id);
		return service.editarBodega(b);
	}
	
	@DeleteMapping(path= {"/eliminar/{id}"})
	public Bodega eliminarBodega(@PathVariable("id") int id) {
		return service.eliminarBodega(id);
	}
}
