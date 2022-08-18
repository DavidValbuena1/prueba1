package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.david.pruebatienda.model.BodegaProducto;

public interface BodegaProductoRepository extends Repository<BodegaProducto, Integer> {
	public List<BodegaProducto> findAll();
	public BodegaProducto save(BodegaProducto bp);
	public BodegaProducto findById(int id);
	public BodegaProducto deleteById(int id);
	
	@Query("SELECT bp FROM BodegaProducto bp WHERE bp.idBodega.id=?1")
	public List<BodegaProducto> buscarPorBodega(int idBodega);
	
	@Query("SELECT bp FROM BodegaProducto bp WHERE bp.idProducto.id=?1")
	public List<BodegaProducto> buscarPorProducto(int idProducto);
}
