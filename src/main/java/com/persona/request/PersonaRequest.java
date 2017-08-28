package com.persona.request;

import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Named;

import com.persona.entity.PersonaEntity;
import com.persona.facade.PersonaFacade;

@Named(value = "becaRequestBean")
@javax.faces.bean.RequestScoped
public class PersonaRequest implements Serializable {

	private static final long serialVersionUID = 2126657125399786741L;
	
	@Inject
	private PersonaFacade personaFacade;

	public void save(PersonaEntity personaEntity) {
		personaFacade.save(personaEntity);
	}

}
