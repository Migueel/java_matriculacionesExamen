package com.zubiri.matriculas;

import java.util.Scanner;

public class Asignatura {

	private String nombre;
	private int creditos;
	private Profesor profesor;
	
	//Constructor 1
	public Asignatura(Scanner sc) {
		System.out.println("Introduce el nombre de la asignatura: ");
		this.setNombre(sc.next());
		System.out.println("Introduce los creditos de dicha asignatura: ");
		this.setCreditos(sc.nextInt());
		System.out.println("Introduce los siguientes datos del profesor de dicha asignatura: ");
		this.setProfesor(new Profesor(sc));
	}
	//Constructor 2
	public Asignatura(String nombre, int creditos, Profesor profesor){
		this.nombre = nombre;
		this.creditos = creditos;
		this.profesor = profesor;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	  
	public String formattedAsignatura() {
		
		String formattedAsignatura = 
				"NOMBRE: " +this.getNombre() +"\n" + 
				"CREDITOS: " +this.getCreditos()+"\n" +
				"DATOS DEL PROFESOR: " +this.getProfesor();
				
		return formattedAsignatura;
		
	}
	
	/**
     * Método que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, String separator) {
		String[] strArray = personaStr.split(separator);
		
		this.setNombre(strArray[0]);
		this.setCreditos(strArray[1]);
		this.setProfesor(new Profesor(strArray[2]));
		
	}

}
