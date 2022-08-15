package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.david.pruebatienda.model.FacturaTemporal;
import com.david.pruebatienda.repository.FacturaTemporalRepository;
import com.david.pruebatienda.service.SFacturaTemporal;

public class FacturaTemporalImp implements SFacturaTemporal {
	
	@Autowired
	private FacturaTemporalRepository repositorio;

	@Override
	public List<FacturaTemporal> obtenerFacturasTemporales() {
		return repositorio.findAll();
	}

	@Override
	public FacturaTemporal insertarDetalleTemp(FacturaTemporal f) {
		return repositorio.save(f);
	}

	@Override
	public FacturaTemporal editarDetalleTemp(FacturaTemporal f) {
		return repositorio.save(f);
	}

	@Override
	public FacturaTemporal borrarDetalleTemp(int id) {
		return repositorio.deleteById(id);
	}

	@Override
	public FacturaTemporal buscarId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public List<FacturaTemporal> obtenerDetallesId(int id) {
		return repositorio.buscarDetallesTemp(id);
	}

}
