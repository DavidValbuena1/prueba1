package com.david.pruebatienda.model;

import java.io.Serializable;

public class BodegaProductoId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Bodega idBodega;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "BodegaProductoId [idBodega=" + idBodega + ", idProducto=" + idProducto + "]";
	}
	
	
	
}
