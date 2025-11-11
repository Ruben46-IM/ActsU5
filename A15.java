package com;

import java.util.Arrays;
import java.util.Scanner;

public class A15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("De cuantos números quieres la tabla");
		int n = sc.nextInt();
		int[] tabla = new int [n];
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Dime un número");
			tabla[i] = sc.nextInt();	
	}
		System.out.println(Arrays.toString(tabla));
		System.out.println("Impares: " + rellenaPares(tabla));
}
	
	public static int rellenaPares(int[] t) {
		Scanner sc = new Scanner(System.in);
		int contaPares = 0;
		for(int i =0; i<t.length;i++) {
			System.out.println("Dime un número");
			int valor = sc.nextInt();
			if(valor % 2 == 0) {
				t[i] = valor;
				contaPares++;
			} 
		}
		return contaPares;
	}
}
