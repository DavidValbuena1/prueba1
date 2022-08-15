package com.david.pruebatienda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="factura_temp")
public class FacturaTemporal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idF;
	
	@Column
	private long precioUnidad;
	
	@Column
	private long cantidad;
	
	@Column
	private long precioTotal;
	
	@OneToOne
	@JoinColumn(name="codProducto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name="idBorrador")
	private Borrador borrador;

	public int getIdF() {
		return idF;
	}

	public void setIdF(int idF) {
		this.idF = idF;
	}

	public long getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(long precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public long getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(long precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Borrador getBorrador() {
		return borrador;
	}

	public void setBorrador(Borrador borrador) {
		this.borrador = borrador;
	}

	@Override
	public String toString() {
		return "FacturaTemporal [idF=" + idF + ", precioUnidad=" + precioUnidad + ", cantidad=" + cantidad
				+ ", precioTotal=" + precioTotal + ", producto=" + producto + ", borrador=" + borrador + "]";
	}
		
	
}
