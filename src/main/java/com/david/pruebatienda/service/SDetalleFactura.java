package com.david.pruebatienda.service;

import java.util.List;

import com.david.pruebatienda.model.DetalleFactura;

public interface SDetalleFactura {
	public List<DetalleFactura> encontrarDetalles();
	public DetalleFactura insertarDetalle(DetalleFactura df);
	public DetalleFactura editarDetalle(DetalleFactura df);
	public DetalleFactura eliminarDetalle(int id);
	public DetalleFactura encontrarDetalle(int id);
	
	public List<DetalleFactura> encontrarDetallesPorFactura(int idFactura);
}
