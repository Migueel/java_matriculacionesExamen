package com.zubiri.matriculas;

import java.util.Scanner;

public abstract class Persona{
	
	private String dni;
	private String nombre;
	private String apellido;
	
	//Constructor 1
	public Persona(String dni, String nombre, String apellido){
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	//Contructor 2
	public Persona(Scanner sc){
		System.out.println("Introduce el DNI de la persona:");
		this.setDni(sc.next());
		System.out.println("Introduce su nombre:");
		this.setNombre(sc.next());
		System.out.println("Introduce su apellido:");
		this.setApellido(sc.next());	
	}
	//constructor 3
		public Persona(String personaStr, String separator){
		String[] strArray = personaStr.split(separator);
		this.setDni(strArray[0]);
		this.setNombre(strArray[1]);
		this.setApellido(strArray[2]);
		}
	

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String formattedPersona() {
		String formattedPersona = 
				"DNI: " +this.getDni() +"\n" +
				"NOMBRE: " +this.getNombre() +"\n" +
				"APELLIDO: " +	this.getApellido();
		return formattedPersona;
		
	}
	
	/**
	 * Metodo que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {
		String[] strArray = personaStr.split(separator);
		
		this.setDni(strArray[0]);
		this.setNombre(strArray[1]);
		this.setApellido(strArray[2]);
		
	}
}
