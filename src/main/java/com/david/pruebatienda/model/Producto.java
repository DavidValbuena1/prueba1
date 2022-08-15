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
@Table(name="productos")
public class Producto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="categorias_id")
	private Categoria idCategoria;
	
	@ManyToOne
	@JoinColumn(name="proveedores_id")
	private Proveedor idProveedor;
	
	@Column
	private String nombre;
	
	@Column
	private long cantidad;
	
	@Column
	private long precioUnidad;
	
	@Column
	private long precioTotal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Categoria getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Categoria idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Proveedor getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Proveedor idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public long getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(long precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public long getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(long precioTotal) {
		this.precioTotal = precioTotal;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", idCategoria=" + idCategoria + ", idProveedor=" + idProveedor + ", nombre="
				+ nombre + ", cantidad=" + cantidad + ", precioUnidad=" + precioUnidad + ", precioTotal=" + precioTotal
				+ "]";
	}
	
	
	
}
