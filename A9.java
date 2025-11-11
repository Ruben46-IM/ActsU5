package com;

import java.util.Scanner;

public class A9 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int [][] notas = leerDatos();
		double mediaNotaAux;
		
		mediaNotaAux = calcularMediaTrimestre(notas  ,  0);
		System.out.println("Media primer trimestre: " + mediaNotaAux);
		
		mediaNotaAux =calcularMediaTrimestre(notas  ,  1);
		System.out.println("Media segundo trimestre: " + mediaNotaAux);
		
		mediaNotaAux = calcularMediaTrimestre(notas  ,  2);
		System.out.println("Media tercer trimestre: " + mediaNotaAux);
		System.out.println("dime la posición del alumno");
		int posicion = sc.nextInt();
		double notaMedia = calcularMediaAlumno(notas, posicion);
	
		System.out.println("La nota media es " + notaMedia);
	
	}
	public static double calcularMediaAlumno(int [][] notas, int pos) throws Exception {
		double media = 0.0;
		
		if(pos >= notas.length) {
			throw new Exception("Se paso del rango");
		}
	
		int [] notaAlumno = notas[pos];
		for(int i=0; i<notaAlumno.length; i++) {
			media+=notaAlumno[i];
		}
		media = media/3;
		
		return media;
	}
	
	public static double calcularMediaTrimestre( int [][] notas  ,  int trimestre ) {
		double media = 0.0;
		
		for(int i=0; i<notas.length; i++) {
			media += notas[i][trimestre];
		}
		media = media / notas.length;
		
		return media;
	}
	
	public static	int [][] leerDatos(){
		Scanner sc = new Scanner(System.in);
		final int ALUMNOS = 5;
		final int TRIMESTRES = 3;
		
		int [][] notas = new int[ALUMNOS] [TRIMESTRES];
		
		for(int i=0; i<ALUMNOS; i++) {
			for(int j=0; j<TRIMESTRES; j++) {
				System.out.println("Trimestre: " + (j+1) + " y alumno: " + (i+1));
				notas[i][j]=sc.nextInt();
			}
		}
		return notas;
	  }
}