package com.springTest.springSistem.IngresoPaciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="EXME_Paciente")
public class EXME_Paciente {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int EXME_Paciente_ID;

	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name ="Curp")
	private String curp;
	
	@Column(name = "Edad")
	private String edad;
	
	@Column(name = "Area")
	private String area;

	public int getEXME_Paciente_ID() {
		return EXME_Paciente_ID;
	}

	public void setEXME_Paciente_ID(int eXME_Paciente_ID) {
		EXME_Paciente_ID = eXME_Paciente_ID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
	
}
