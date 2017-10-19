package com.persona.entity;

import java.io.Serializable;

import javax.persistence.Entity;



@Entity
public class PersonaEntity implements Serializable {
	private static final long serialVersionUID = -5066301886674651537L; //DUDA !!!
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private Integer edad;

	public PersonaEntity(String nombre, String apellidoP, String apellidoM, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.edad = edad;
	}

	public PersonaEntity() {   //SUPER DUDA
		super();
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



	
}
