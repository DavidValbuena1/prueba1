package com.david.pruebatienda.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.pruebatienda.model.Producto;
import com.david.pruebatienda.model.Proveedor;
import com.david.pruebatienda.repository.ProductoRepository;
import com.david.pruebatienda.repository.ProveedorRepository;
import com.david.pruebatienda.service.SProducto;

@Component
public class ProductoImp implements SProducto {
	
	@Autowired(required = true)
	private ProductoRepository service;
	
	@Autowired(required=true)
	private SendEmail email;
	
	@Autowired(required=true)
	private ProveedorRepository serviceProveedor;
	
	@Override
	public List<Producto> obtenerProductos() {
		return service.findAll();
	}

	@Override
	public void insertarProducto(Producto p) {
		service.save(p);
	}

	@Override
	public void editarProducto(Producto p) {
		service.save(p);
		Producto producto = new Producto();
		producto = service.findById(p.getId());
		Proveedor proveedor = new Proveedor();
		proveedor = serviceProveedor.findById(producto.getIdProveedor().getId());
		if (producto.getCantidad()<=10) {
			email.sendMail(proveedor.getCorreo(), "Reabastecimiento", "Buenas tardes"+"\n Señor "+ proveedor.getNombre()+"\n\n le solicitamos comunicarnos para el reabastecimiento del producto "+producto.getNombre());
		}
	}

	@Override
	public Producto borrarProducto(int id) {
		return service.deleteById(id);
	}

	@Override
	public Producto buscarProducto(int id) {
		return service.findById(id);
	}

	@Override
	public int idMaximoProducto() {
		return (int) service.idMaximoProducto();
	}

}
