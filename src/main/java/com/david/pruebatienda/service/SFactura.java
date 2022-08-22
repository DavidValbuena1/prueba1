package com.david.pruebatienda.service;

import java.util.List;

import com.david.pruebatienda.model.Factura;

public interface SFactura {
	public List<Factura> encontrarFacturas();
	public Factura insertarFactura(Factura f);
	public Factura editarFactura(Factura f);
	public Factura eliminarFactura(int id);
	public Factura buscarFactura(int id);
	public int contar();
}
