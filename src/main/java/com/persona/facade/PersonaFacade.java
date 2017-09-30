package com.persona.facade;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;

import com.persona.base.BasePersona;
import com.persona.entity.PersonaEntity;

@Stateless
public class PersonaFacade implements Serializable {

	private static final long serialVersionUID = 1618438682869189375L; // DUDA PORQUE ES DISTINTO EL SERIAL DEL ENTITY A ESTE
        
	public void save(PersonaEntity personaEntity) {

		System.out.println("Entrando al Facade");
		BasePersona.listaPersonas.add(personaEntity);

	//	System.out.println("Total personas en variable --- >");
				
		for (int i = 0; i < BasePersona.listaPersonas.size(); i++) {
			System.out.println(BasePersona.listaPersonas.get(i).getNombre());				
		}

		
	}
	
	public void refresh() {
		BasePersona.listaPersonas.clear();
	}

	public List<PersonaEntity> getAll() {
		return BasePersona.listaPersonas;
	}
	
}
