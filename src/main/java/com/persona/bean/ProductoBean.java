package com.persona.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.persona.entity.ProductoEntity;
import com.persona.request.ProductoRequest;

@Named(value = "productoBean")
@ViewScoped
public class ProductoBean implements Serializable {

	private static final long serialVersionUID = -6542421391671499826L;
	private Integer codigo;
	private String nombre;
	private Integer monto;
	private Integer cantidad;

	@Inject
	private ProductoEntity producto;

	@Inject
	private ProductoRequest productoRequest;

	private List<ProductoEntity> listaProducto = new ArrayList<ProductoEntity>();

	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			producto = new ProductoEntity();
			producto.setCodigo(i);
			producto.setNombre("Producto " + i);
			producto.setMonto(30000);
			producto.setCantidad(10 + i);
			this.productoRequest.save(producto);
		}

		listaProducto = productoRequest.getAll();

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getMonto() {
		return monto;
	}

	public void setMonto(Integer monto) {
		this.monto = monto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public List<ProductoEntity> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(List<ProductoEntity> listaProducto) {
		this.listaProducto = listaProducto;
	}

}
