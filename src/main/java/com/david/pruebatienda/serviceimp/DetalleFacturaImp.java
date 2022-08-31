package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.DetalleFactura;
import com.david.pruebatienda.model.Producto;
import com.david.pruebatienda.repository.DetalleFacturaRepository;
import com.david.pruebatienda.repository.ProductoRepository;
import com.david.pruebatienda.service.SDetalleFactura;

@Component
public class DetalleFacturaImp implements SDetalleFactura {

	@Autowired(required=true)
	private DetalleFacturaRepository repositorio;
	
	@Autowired(required=true)
	private ProductoRepository repositorioProducto;
	
	@Override
	public List<DetalleFactura> encontrarDetalles() {
		return repositorio.findAll();
	}

	@Override
	public boolean insertarDetalles(List<DetalleFactura> df) {
		DetalleFactura detalle = new DetalleFactura();
		Producto p = new Producto();
		long cantidad=0;
		for (DetalleFactura i:df) {
			p = repositorioProducto.findById(i.getIdProducto().getId());
			if(p.getCantidad()>=i.getCantidad()) {
				cantidad=p.getCantidad() - i.getCantidad();
				p.setCantidad(cantidad);
				repositorioProducto.save(p);
			}else if(p.getCantidad()<i.getCantidad()) {
				return false;
			}
		}
		repositorio.saveAll(df);
		return true;
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
