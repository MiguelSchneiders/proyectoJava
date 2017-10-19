
package com.persona.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.persona.entity.PersonaEntity;
import com.persona.request.PersonaRequest;

@Named(value = "personaBean")
@ViewScoped
public class PersonaBean implements Serializable {
	private static final long serialVersionUID = -6009667888721888251L; // ESTE SERIAL TAMBIEN ES DISTINTO :C

	@Inject
	private PersonaRequest personaRequest;

	private List<PersonaEntity> listaPersonas = new ArrayList<PersonaEntity>();

	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private Integer edad;
	boolean editable;
	
	public void guardar() {
		
		PersonaEntity persona = new PersonaEntity();
		
		persona.setNombre(this.getNombre());
		persona.setApellidoP(this.getApellidoP());
		persona.setApellidoM(this.getApellidoM());
		persona.setEdad(this.getEdad());
		personaRequest.save(persona);
	
		nombre = "";
		apellidoP = "";
		apellidoM = "";
		edad = null ;
		
		listaPersonas = personaRequest.getAll();
	}
	
	


	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public List<PersonaEntity> getListaPersona() {
		return listaPersonas;
	}


	public void setListaPersonas(List<PersonaEntity> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

		

}
