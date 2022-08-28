package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.DetalleFactura;

public interface DetalleFacturaRepository extends Repository<DetalleFactura, Integer> {
	public List<DetalleFactura> findAll();
	public List<DetalleFactura> saveAll(Iterable<DetalleFactura> lista);
	public DetalleFactura save(DetalleFactura df);
	public DetalleFactura findById(int id);
	public DetalleFactura deleteById(int id);
	
	@Query("SELECT df FROM DetalleFactura df WHERE df.idFactura.id= ?1")
	public List<DetalleFactura> encontrarPorFactura(int idFactura);
}
