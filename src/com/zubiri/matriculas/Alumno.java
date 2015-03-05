package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona {
	
	private int anoInscripcion = -1;
	private String ciclo = null;
	private ArrayList<Matricula> matriculas = null;
	
	//Constructor 1
		Alumno(String dni, String nombre, String apellido, int anoInscripcion, String ciclo, ArrayList<Matricula> matriculas){
			super(dni, nombre, apellido);
			this.ciclo = ciclo;
			this.matriculas = matriculas;
		}
	//Constructor 2
		Alumno(Scanner sc){
			super(sc);
			System.out.println("Introduce el año de inscripcion del alumno: ");
			this.setAnoInscripcion(sc.nextInt());
			System.out.println("Introduce el ciclo del alumno: ");
			this.setCiclo(sc.next());
		}
	//constructor 3
			public Alumno(String personaStr, String separator){
			super(personaStr, separator);
			String[] strArray = personaStr.split(separator);
			this.setAnoInscripcion(strArray[3]);
			this.setCiclo(strArray[4]);
			this.setMatriculas(strArray[5]);
			}
		
	public int getAnoInscripcion() {
		return anoInscripcion;
	}

	public void setAnoInscripcion(int anoInscripcion) {
		this.anoInscripcion = anoInscripcion;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	try {
		public String formattedAlumno() {
			String formattedAlumno = 
					super.formattedPersona()
					+"\nAÑO DE INSCRIPCION: " +this.getAnoInscripcion()
					+"\nCICLO: " +this.getCiclo()
					+"\nMATRICULAS: " +this.getMatriculas();
			return formattedAlumno;		
		} 
	} 
	catch (Exception e) {
		System.out.println("Error al formatear los datos del alumno.");
		}
}
	
}

	
