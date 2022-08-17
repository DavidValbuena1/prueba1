package com.david.pruebatienda.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bodegas_has_productos")
public class BodegaProducto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name="bodegas_id")
	private Bodega idBodega;
	
	@Id
	@ManyToOne
	@JoinColumn(name="productos_id")
	private Producto idProducto;

	public Bodega getIdBodega() {
		return idBodega;
	}

	public void setIdBodega(Bodega idBodega) {
		this.idBodega = idBodega;
	}

	public Producto getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}

	@Override
	public String toString() {
		return "BodegaProducto [idBodega=" + idBodega + ", idProducto=" + idProducto + "]";
	}
	
	
	
}
