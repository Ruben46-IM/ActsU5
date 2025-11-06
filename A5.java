package com;

import java.util.Random;
import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = -1;
		do {
			System.out.println("Dime un número entre 1 y 5: ");
			n = sc.nextInt();
		}while(n < 0 || n > 5 );
		
		
		int[] tabla = crearTablaVacia(n);
		tabla = rellenarTablaConNumeroAleatorio(tabla);
	}
	
public static int[] crearTablaVacia(int n) {
	int [] tabla = new int[n];
	return tabla;
}
	public static int[] rellenarTablaConNumeroAleatorio(int[] tabla) {
		Random random = new Random();
		for(int i = 0; i < tabla.length; i++){
			tabla[i] = random.nextInt(10);
		}
		return tabla;
		
	}
	
}
