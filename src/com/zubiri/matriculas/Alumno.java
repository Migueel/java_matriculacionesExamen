package com.zubiri.matriculas;

public class Alumno extends Persona {
	
	//Año en el que se inscribió por primera vez en alguna asignatura
	int añoInscripción = -1;
	//Ciclo que cursa el alumno
	String ciclo = null;
	
	//Matrículas realizadas a lo largo de los años en las distintas asignaturas
	ArrayList<Matricula> matriculas = null;
	
	public int getAñoInscripcion() {
		return añoInicio;
	}
	
	public void setAñoInscripcion(int añoInscripcion) {
		this.añoInicio = añoInicio;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

}
