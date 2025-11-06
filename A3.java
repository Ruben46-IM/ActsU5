package com;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime de cuantos numeros tiene la tabla: ");
		int n = sc.nextInt();
		int[] t = new int [n];
		for (int i = 0; i < t.length; i++) {
			
			System.out.print("Dime un número: ");
			t[i] = sc.nextInt();
			}
	}
	public static double MediaPositiva (int[] t) {
		int contadorP = 0;
		double resultado = 0.0;
		for(int i = 0; i<t.length;i++) {
			if(t[i] >= 5) {
				contadorP++;
				resultado += t[i];
		}
		}
		return resultado / contadorP;
	}
	public static double MediaNegativos(int[] t) {
		int contadorN = 0;
		double resultado = 0.0;
		for(int i = 0; i<t.length;i++) {
			if(t[i] < 5 && t[i] >= 1) {
				contadorN++;
				resultado += t[i];
	}
		}	
		return resultado / contadorN;
	}
	public static int CuentaCeros(int[] t) {
		int contador0 = 0;
		for(int i = 0; i<t.length; i++) {
			if(t[i] == 0) {
				contador0++;
		}
		}
		return contador0;
		

}
}
