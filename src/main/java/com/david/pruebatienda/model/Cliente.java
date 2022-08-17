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
@Table(name="clientes")
public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@Column
	private String correo;
	
	@Column
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name="tipoidentificacion_id")
	private TipoIdentificacion idTipo;
	
	@Column
	private String numeroidentificacion;
	
	@Column
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public TipoIdentificacion getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(TipoIdentificacion idTipo) {
		this.idTipo = idTipo;
	}

	public String getNumeroIdentificacion() {
		return numeroidentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroidentificacion = numeroIdentificacion;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo
				+ ", telefono=" + telefono + ", idTipo=" + idTipo + ", numeroIdentificacion=" + numeroidentificacion
				+ ", password=" + password + "]";
	}
	
	
}
