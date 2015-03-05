package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Matriculas {
	private static ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	public static void añadirMatriculas() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantas matriculas quieres añadir?");
		int opcion = sc.nextInt();
		
		for (int i = 0; i < opcion ; i++) {
			matriculas.add(new Matricula(sc));
		}	
	}
	public static String formattedMatriculas() {
		String formattedMatriculas = 
				"MATRICULAS \n";
				try {
					for (int m = 0; m < matriculas.size(); m++) {
					formattedMatriculas += matriculas.get(m).formattedMatricula();
					}	
				} catch (Exception e) {
					System.out.println("Error al formatear las matriculas.");
				}
			return formattedMatriculas;
	}
}
