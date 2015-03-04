package com.zubiri.matriculas;

public class Matricula extends Asignatura {
	
	int añoMatriculacion;
    double precio;
    
	public String getAsignatura() {
		return asignatura;
	}
	
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public int getAñoMatriculacion() {
		return añoMatriculacion;
	}
	
	public void setAñoMatriculacion(int añoMatriculacion) {
		this.añoMatriculacion = añoMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	
	/**
	 * Método que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matrícula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		
	}
	
}
