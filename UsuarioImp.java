package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.Usuario;
import com.david.pruebatienda.repository.UsuarioRepository;
import com.david.pruebatienda.service.SUsuario;

@Component
public class UsuarioImp implements SUsuario{
	
	@Autowired(required=true)
	private UsuarioRepository repositorio;
	
	@Override
	public List<Usuario> encontrarTodos() {
		return repositorio.findAll();
	}

	@Override
	public Usuario encontrarPorId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Usuario insertarUsuario(Usuario u) {
		return repositorio.save(u);
	}

	@Override
	public Usuario editarUsuario(Usuario u) {
		return repositorio.save(u);
	}

	@Override
	public Usuario eliminarUsuario(int id) {
		return repositorio.deleteById(id);
	}

	@Override
	public Usuario validar(String correo, String password) {
		return repositorio.validar(correo, password);
	}
	
}
