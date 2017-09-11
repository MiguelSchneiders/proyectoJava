package com.persona.facade;

import java.io.Serializable;
import java.util.List;

import com.persona.base.BaseProducto;
import com.persona.entity.ProductoEntity;

public class ProductoFacade implements Serializable {

	private static final long serialVersionUID = -5639759723304715267L;

	public void save(ProductoEntity productoEntity) {
		BaseProducto.listaProducto.add(productoEntity);
		System.out.println("Elemento Guardado");
	}

	public void update(ProductoEntity productoEntity) {

		for (int i = 0; i < BaseProducto.listaProducto.size(); i++) {
			if (productoEntity.getCodigo() == BaseProducto.listaProducto.get(i).getCodigo()) {
				BaseProducto.listaProducto.get(i).setCantidad(productoEntity.getCantidad());
				BaseProducto.listaProducto.get(i).setMonto(productoEntity.getMonto());
				BaseProducto.listaProducto.get(i).setNombre(productoEntity.getNombre());
				System.out.println("Elemento actualizado");
			}
		}

		// Probar si funciona
		/*
		 * for (ProductoEntity entity : BaseProducto.listaProducto) { if
		 * (productoEntity.getCodigo() == entity.getCodigo()) {
		 * entity.setCantidad(productoEntity.getCantidad());
		 * entity.setNombre(entity.getNombre());
		 * entity.setMonto(productoEntity.getMonto());
		 * System.out.println("Elemento actualizado"); }
		 */
	}

	public void delete(Integer codigo) {
		if (codigo != null) {
			for (int i = 0; i < BaseProducto.listaProducto.size(); i++) {
				if (codigo == BaseProducto.listaProducto.get(i).getCodigo()) {
					BaseProducto.listaProducto.remove(i);
					System.out.println("Valor eliminado");
				}
			}
		}
	}

	public void refresh() {
		BaseProducto.listaProducto.clear();
	}

	public List<ProductoEntity> getAll() {
		return BaseProducto.listaProducto;
	}

}
