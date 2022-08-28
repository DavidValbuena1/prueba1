package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.DetalleFactura;
import com.david.pruebatienda.repository.DetalleFacturaRepository;
import com.david.pruebatienda.service.SDetalleFactura;

@Component
public class DetalleFacturaImp implements SDetalleFactura {

	@Autowired(required=true)
	private DetalleFacturaRepository repositorio;
	@Override
	public List<DetalleFactura> encontrarDetalles() {
		return repositorio.findAll();
	}

	@Override
	public List<DetalleFactura> insertarDetalles(List<DetalleFactura> df) {
		return repositorio.saveAll(df);
	}

	@Override
	public DetalleFactura editarDetalle(DetalleFactura df) {
		return repositorio.save(df);
	}

	@Override
	public DetalleFactura eliminarDetalle(int id) {
		return repositorio.deleteById(id);
	}

	@Override
	public DetalleFactura encontrarDetalle(int id) {
		return repositorio.findById(id);
	}

	@Override
	public List<DetalleFactura> encontrarDetallesPorFactura(int idFactura) {
		return repositorio.encontrarPorFactura(idFactura);
	}

}
