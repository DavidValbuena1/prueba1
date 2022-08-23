package com.david.pruebatienda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.david.pruebatienda.model.Usuario;

@Service
public interface SUsuario {
	public List<Usuario> encontrarTodos();
	public Usuario encontrarPorId(int id);
	public Usuario insertarUsuario(Usuario u);
	public Usuario editarUsuario(Usuario u);
	public Usuario eliminarUsuario(int id);
}
