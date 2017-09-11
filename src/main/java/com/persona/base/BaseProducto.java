package com.persona.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.persona.entity.ProductoEntity;

public class BaseProducto implements Serializable {
	private static final long serialVersionUID = -4462955496862411976L;

	public static List<ProductoEntity> listaProducto = new ArrayList<ProductoEntity>();

}
