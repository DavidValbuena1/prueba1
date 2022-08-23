package com.david.pruebatienda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.david.pruebatienda.model.Proveedor;

@Service
public interface SProveedor {
	public List<Proveedor> encontrarProveedores();
	public Proveedor insertarProveedor(Proveedor p);
	public Proveedor editarProveedor(Proveedor p);
	public Proveedor eliminarProveedor(int id);
	public Proveedor buscarPorId(int id);
}
