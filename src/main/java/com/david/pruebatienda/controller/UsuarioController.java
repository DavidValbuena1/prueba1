package com.david.pruebatienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.pruebatienda.model.Usuario;
import com.david.pruebatienda.service.SUsuario;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/Prueba1/Usuario"})
public class UsuarioController {
	
	@Autowired(required=true)
	private SUsuario service;
	
	@GetMapping(path= {"/listar"})
	public List<Usuario> encontrarTodos(){
		return service.encontrarTodos();
	}
	
	@GetMapping(path= {"/listarId/{id}"})
	public Usuario encontrarPorId(@PathVariable("id") int id) {
		return service.encontrarPorId(id);
	}
	
	@PostMapping(path= {"/agregar"})
	public Usuario insertar(@RequestBody Usuario u) {
		return service.insertarUsuario(u);
	}
	
	@PutMapping(path= {"/editar/{id}"})
	public Usuario editar(@PathVariable("id") int id, @RequestBody Usuario u) {
		u.setId(id);
		return service.editarUsuario(u);
	}
	
	@DeleteMapping(path= {"/eliminar/{id}"})
	public Usuario eliminar(@PathVariable("id") int id) {
		return service.eliminarUsuario(id);
	}
	
	@PostMapping(path= {"/validar"})
	public Usuario validar(@RequestBody Usuario u) {
		String correo = u.getCorreo();
		String password = u.getPassword();
		return service.validar(correo, password);
	}
}
