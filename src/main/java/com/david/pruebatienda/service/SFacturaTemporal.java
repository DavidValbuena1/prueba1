package com.david.pruebatienda.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.FacturaTemporal;

public interface SFacturaTemporal {
	public List<FacturaTemporal> obtenerFacturasTemporales();
	public FacturaTemporal insertarDetalleTemp(FacturaTemporal f);
	public FacturaTemporal editarDetalleTemp(FacturaTemporal f);
	public FacturaTemporal borrarDetalleTemp(int id);
	public FacturaTemporal buscarId(int id);
	
	public List<FacturaTemporal> obtenerDetallesId(int id);
}
