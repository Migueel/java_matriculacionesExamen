package com.zubiri.matriculas;

import java.util.Scanner;

public class Matricula extends Asignatura {
	
	private int anoPublicacion;
    private double precio;
    
    //constructor 1
    public Matricula(Scanner sc){
		super(sc);	
		try {
			System.out.println("Introduce el año de publicacion de la matricula: ");
			this.setAnoPublicacion(sc.nextInt());
		} catch (Exception e) {
			System.out.println("Introduce un año valido.");
		}
		System.out.println("Introduce el precio de la matricula: ");
		this.setPrecio(sc.nextDouble());	
	}
    //constructor 2
    public Matricula(String nombre, int creditos, Profesor profesor, int anoPublicacion, double precio){
    	super(nombre, creditos, profesor);
    	this.anoPublicacion = anoPublicacion;
    	this.precio = precio;
    }
    
    public int getAnoPublicacion() {
		return anoPublicacion;
	}
	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/* metodo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matricula.
	  @return
	  */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		double descuento = (precio * porcentaje)/100;
		
		return descuento;
			
	}
	public String formattedMatricula() {
		String formattedMatricula = 
				super.formattedAsignatura() +
				"\nAÑO DE PUBLICACION: " +this.getAnoPublicacion()
				+"\nPRECIO: " +this.getPrecio();
		return formattedMatricula;
	}
	
}
