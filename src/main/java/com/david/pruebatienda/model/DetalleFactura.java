package com.david.pruebatienda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detallefacturas")
public class DetalleFactura implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private long cantidad;
	
	@Column
	private long precio;
	
	@ManyToOne
	@JoinColumn(name="facturas_id")
	private Factura idFactura;
	
	@ManyToOne
	@JoinColumn(name="productos_id")
	private Producto idProducto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public long getPrecio() {
		return precio;
	}

	public void setPrecio(long precio) {
		this.precio = precio;
	}

	public Factura getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Factura idFactura) {
		this.idFactura = idFactura;
	}

	public Producto getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}

	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", precio=" + precio + ", idFactura=" + idFactura
				+ ", idProducto=" + idProducto + "]";
	}
	
	
}
