package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.Factura;
import com.david.pruebatienda.repository.FacturaRepository;
import com.david.pruebatienda.service.SFactura;

@Component
public class FacturaImp implements SFactura {
	
	@Autowired(required=true)
	private FacturaRepository repositorio;
	@Override
	public List<Factura> encontrarFacturas() {
		return repositorio.findAll();
	}

	@Override
	public Factura insertarFactura(Factura f) {
		return repositorio.save(f);
	}

	@Override
	public Factura editarFactura(Factura f) {
		return repositorio.save(f);
	}

	@Override
	public Factura eliminarFactura(int id) {
		return repositorio.deleteById(id);
	}

	@Override
	public Factura buscarFactura(int id) {
		return repositorio.findById(id);
	}

	@Override
	public int contar() {
		return (int) repositorio.count();
	}

}
