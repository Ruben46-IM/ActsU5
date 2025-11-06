package com;

import java.util.Arrays;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = {2,5,13,6,9,10};
		int aux;
		System.out.println("INICIO: ");
		mostrarTabla(num);
		
		do {
			System.out.println("Dime el indice: ");
			int n = sc.nextInt();
			if(n>=num.length || n < 0) {
				continue;
			}
			aux =num[num.length - 1];
			
			num = Arrays.copyOf(num, num.length - 1);
			num[n] = aux;
			
			mostrarTabla(num);
		}while(num.length>0);
		
		System.out.println("FIN");
	}

	public static void mostrarTabla (int [] tabla) {
		for(int elemento : tabla) {
			System.out.print(elemento + "\t");
		}
		System.out.print( "]");
	}
	
	
	
	
}
