package com.david.pruebatienda.model;

import java.io.Serializable;

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
public class FacturaTemporal implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idF;
	
	@Column
	private long preciounidad;
	
	@Column
	private long cantidad;
	
	@Column
	private long preciototal;
	
	@OneToOne
	@JoinColumn(name="codproducto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name="idborrador")
	private Borrador Borrador;

	public int getIdF() {
		return idF;
	}

	public void setIdF(int idF) {
		this.idF = idF;
	}

	public long getPrecioUnidad() {
		return preciounidad;
	}

	public void setPrecioUnidad(long precioUnidad) {
		this.preciounidad = precioUnidad;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public long getPrecioTotal() {
		return preciototal;
	}

	public void setPrecioTotal(long precioTotal) {
		this.preciototal = precioTotal;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Borrador getBorrador() {
		return Borrador;
	}

	public void setBorrador(Borrador borrador) {
		this.Borrador = borrador;
	}

	@Override
	public String toString() {
		return "FacturaTemporal [idF=" + idF + ", precioUnidad=" + preciounidad + ", cantidad=" + cantidad
				+ ", precioTotal=" + preciototal + ", producto=" + producto + ", borrador=" + Borrador + "]";
	}
		
	
}
