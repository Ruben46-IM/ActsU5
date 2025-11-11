package com;

import java.util.Arrays;
import java.util.Random;

public class A10 {

	public static void main(String[] args) {
		int[] numeros = generarTablaAleatoria(10);
		int indicePares =0, indicesImpares=0;
		int total = contarPares(numeros);
		int[] valoresPares = new int[total];
		int[] valoresImpares = new int[numeros.length - total];
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				valoresPares[indicePares] = numeros[i];
				indicePares++;
			}else {
				valoresImpares[indicesImpares] = numeros[i];
				indicesImpares++;
			}
		}
		
		System.out.println("Pares: " +  Arrays.toString(valoresPares));
		System.out.println("Impares: " +  Arrays.toString(valoresImpares));

	}
	
	public static int contarPares(int [] tabla) {
		int total = 0;
		for(int num : tabla) {
			if(num %2 ==0) {
				total++;
			}
		}
		return total;
	}
	public static int[] generarTablaAleatoria(int n) {
		int [] tabla = new int[n];
		Random random = new Random();
		for(int i=0; i<tabla.length; i++) {
			tabla[i] = random.nextInt(10);
		}
		return tabla;
	}
}