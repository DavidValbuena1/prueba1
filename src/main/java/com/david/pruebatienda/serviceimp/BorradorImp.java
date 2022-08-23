package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.Borrador;
import com.david.pruebatienda.repository.BorradorRepository;
import com.david.pruebatienda.service.SBorrador;

@Component
public class BorradorImp implements SBorrador{

	@Autowired(required=true)
	private BorradorRepository repositorio;
	
	@Override
	public List<Borrador> buscarBorradores() {
		return repositorio.findAll();
	}

	@Override
	public Borrador insertarBorrador(Borrador b) {
		return repositorio.save(b);
	}

	@Override
	public Borrador editarBorrador(Borrador b) {
		return repositorio.save(b);
	}

	@Override
	public Borrador eliminarBorrador(int id) {
		return repositorio.deleteById(id);
	}

	@Override
	public Borrador buscarBorrador(int id) {
		return repositorio.findById(id);
	}
	
}
