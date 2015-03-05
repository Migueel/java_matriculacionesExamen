package com.zubiri.matriculas;

import java.util.Scanner;

public class Profesor extends Persona {
	
	private static String titulacion;
	private static String departamento;
	
	//constructor 1
		public Profesor(Scanner sc){
			super(sc);
			System.out.println("Introduce la titulacion de dicho profesor: ");
			this.setTitulacion(sc.next());
			System.out.println("Introduce el departamento al que pertenece: ");
			this.setDepartamento(sc.next());
		}
	//constructor 2
		public Profesor(String dni, String nombre, String apellido, String titulacion, String departamento){
			super(dni, nombre, apellido);
			this.titulacion = titulacion;
			this.departamento = departamento;
		}
	//constructor 3
		public Profesor(String personaStr, String separator){
		super(personaStr, separator);
		String[] strArray = personaStr.split(separator);
		this.setTitulacion(strArray[3]);
		this.setDepartamento(strArray[4]);
		}
	public static String getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	public static String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String formattedPersona(){
		String formattedProfesor =
				super.formattedPersona() +
				"\nTITULACION: " +getTitulacion() +
				"\nDEPARTAMENTO: " +getDepartamento();
		return formattedProfesor;
	}
	
	
}
