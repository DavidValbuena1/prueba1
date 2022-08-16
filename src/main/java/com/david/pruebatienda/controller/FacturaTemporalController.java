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

import com.david.pruebatienda.model.FacturaTemporal;
import com.david.pruebatienda.service.SFacturaTemporal;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping({"/Prueba1/FacturaTemporal"})
public class FacturaTemporalController {
	
	@Autowired
	private SFacturaTemporal service;
	
	@GetMapping("/Prueba1/FacturaTemporal/listar")
	public List<FacturaTemporal> listar(){
		return service.obtenerFacturasTemporales();
	}
	
	@GetMapping(path= {"/Prueba1/FacturaTemporal/listarId/{id}"})
	public FacturaTemporal listarId(@PathVariable("id") int id) {
		return service.buscarId(id);
	}
	
	@GetMapping (path= {"/Prueba1/FacturaTemporal/obtenerDetalles/{idBorrador}"})
	public List<FacturaTemporal> obtenerDetalles(@PathVariable("idBorrador") int idBorrador){
		return service.obtenerDetallesId(idBorrador);
	}
	
	@PostMapping("/Prueba1/FacturaTemporal/agregar")
	public FacturaTemporal agregar(@RequestBody FacturaTemporal f) {
		return service.insertarDetalleTemp(f);
	}
	
	@PutMapping(path= {"/Prueba1/FacturaTemporal/editar/{id}"})
	public FacturaTemporal editar(@RequestBody FacturaTemporal f, @PathVariable("id") int id) {
		f.setIdF(id);
		return service.editarDetalleTemp(f);
	}
	
	@DeleteMapping(path= {"/Prueba1/FacturaTemporal/eliminar/{id}"})
	public FacturaTemporal eliminar(@PathVariable("id") int id) {
		return service.borrarDetalleTemp(id);
	}
}
