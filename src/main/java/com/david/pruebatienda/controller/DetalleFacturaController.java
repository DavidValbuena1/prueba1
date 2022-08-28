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

import com.david.pruebatienda.model.DetalleFactura;
import com.david.pruebatienda.service.SDetalleFactura;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/DetalleFactura"})
public class DetalleFacturaController {

	@Autowired(required=true)
	private SDetalleFactura service;
	
	@GetMapping(path= {"/listar"})
	public List<DetalleFactura> listar(){
		return service.encontrarDetalles();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public DetalleFactura buscarDetalle(@PathVariable("id") int id) {
		return service.encontrarDetalle(id);
	}
	
	@GetMapping(path= {"/listarPorFactura/{idFactura}"})
	public List<DetalleFactura> buscarDetallesPorFactura (@PathVariable("idFactura") int idFactura){
		return service.encontrarDetallesPorFactura(idFactura);
	}
	
	@PostMapping(path= {"/agregar"})
	public List<DetalleFactura> insertarDetalle(@RequestBody List<DetalleFactura> df) {
		return service.insertarDetalles(df);
	}
	
	@PutMapping(path= {"/editar/{id}"})
	public DetalleFactura editarDetalle(@RequestBody DetalleFactura df, @PathVariable("id") int id ) {
		df.setId(id);
		return service.editarDetalle(df);
	}
	
	@DeleteMapping(path= {"/eliminar/{id}"})
	public DetalleFactura eliminarDetalle(@PathVariable("id") int id) {
		return service.eliminarDetalle(id);
	}
}
