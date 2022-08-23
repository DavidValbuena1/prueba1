package com.david.pruebatienda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.david.pruebatienda.model.Sucursal;

@Service
public interface SSucursal {
	public List<Sucursal> encontrarTodas();
	public Sucursal encontrarPorId(int id);
	public Sucursal insertarSucursal(Sucursal s);
	public Sucursal eliminarSucursal(int id);
	public Sucursal editarSucursal(Sucursal s);
}
