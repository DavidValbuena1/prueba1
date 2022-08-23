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

import com.david.pruebatienda.model.Borrador;
import com.david.pruebatienda.service.SBorrador;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/Borrador"})
public class BorradorController {
	
	@Autowired(required=true)
	private SBorrador service;
	
	@GetMapping(path= {"/listar"})
	public List<Borrador> listaBorradores(){
		return service.buscarBorradores();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public Borrador buscarBorrador(@PathVariable("id") int id) {
		return service.buscarBorrador(id);
	}
	
	@PostMapping(path= {"/agregar"})
	public Borrador insertarBorrador(@RequestBody Borrador b) {
		return service.insertarBorrador(b);
	}
	
	@PutMapping(path= {"/editar/{id}"})
	public Borrador editarBorrador(@RequestBody Borrador b, @PathVariable("id") int id) {
		b.setId(id);
		return service.editarBorrador(b);
	}
	
	@DeleteMapping(path={"/eliminar/{id}"})
	public Borrador eliminarBorrador(@PathVariable("id") int id) {
		return service.eliminarBorrador(id);
	}
}
