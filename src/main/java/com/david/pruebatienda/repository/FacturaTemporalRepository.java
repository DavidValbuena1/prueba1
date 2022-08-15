package com.david.pruebatienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import com.david.pruebatienda.model.FacturaTemporal;

public interface FacturaTemporalRepository extends Repository<FacturaTemporal, Integer> {
	
	public List<FacturaTemporal> findAll();
	public FacturaTemporal findById(int id);
	public FacturaTemporal save(FacturaTemporal f);
	public FacturaTemporal deleteById(int id);
	
	@Query(value="SELECT f FROM FacturaTemporal f WHERE f.Borrador = :idBorrador")
	List<FacturaTemporal> buscarDetallesTemp(int idBorrador);
}
