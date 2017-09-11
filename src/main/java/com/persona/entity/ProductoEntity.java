package com.persona.entity;

import java.io.Serializable;

public class ProductoEntity implements Serializable {

	private static final long serialVersionUID = -6431649828634908695L;
	private Integer codigo;
	private String nombre;
	private Integer monto;
	private Integer cantidad;

	public ProductoEntity() {
		super();
	}

	public ProductoEntity(Integer codigo, String nombre, Integer monto, Integer cantidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.monto = monto;
		this.cantidad = cantidad;
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

}
