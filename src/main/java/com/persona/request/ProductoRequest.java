package com.persona.request;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.persona.entity.ProductoEntity;
import com.persona.facade.ProductoFacade;

@Named(value = "productoRequest")
@RequestScoped
public class ProductoRequest implements Serializable {
	private static final long serialVersionUID = -5684101311042274742L;

	@Inject
	ProductoFacade productoFacade;

	public void save(ProductoEntity productoEntity) {
		productoFacade.save(productoEntity);
	}

	public void update(ProductoEntity productoEntity) {
		productoFacade.update(productoEntity);
	}

	public void delete(Integer codigo) {
		productoFacade.delete(codigo);
	}

	public void refresh() {
		productoFacade.refresh();
	}

	public List<ProductoEntity> getAll() {
		return productoFacade.getAll();
	}

}
