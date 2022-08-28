package com.david.pruebatienda.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="productos_id")
	private Producto idProducto;
	
	@ManyToOne
	@JoinColumn(name="bodegas_id")
	private Bodega idBodega;
	

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

	@Override
	public int hashCode() {
		return Objects.hash(idBodega, idProducto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BodegaProducto other = (BodegaProducto) obj;
		return Objects.equals(idBodega, other.idBodega) && Objects.equals(idProducto, other.idProducto);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
