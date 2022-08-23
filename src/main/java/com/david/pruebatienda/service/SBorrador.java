package com.david.pruebatienda.service;

import java.util.List;

import com.david.pruebatienda.model.Borrador;

public interface SBorrador {
	public List<Borrador> buscarBorradores();
	public Borrador insertarBorrador(Borrador b);
	public Borrador editarBorrador(Borrador b);
	public Borrador eliminarBorrador(int id);
	public Borrador buscarBorrador(int id);
}
