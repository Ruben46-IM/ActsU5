package com;

import java.util.Arrays;
import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime las puntuaciones de los programadores");
	int[] puntos = new int[5];
	for (int i = 0; i < puntos.length; i++) {
		
		System.out.print("Dime las puntuaciones: ");
		puntos[i] = sc.nextInt();
	}
		Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
		System.out.println("Dime las notas de exhibicion:");
		int numx = 1;
		for(int j = 0; j <= 2; j++) {
			numx = sc.nextInt();
			if(numx < 0) break;
			puntos = Arrays.copyOf(puntos, puntos.length+1);
			puntos [puntos.length - 1] = numx;
		}
		Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
		
		
	}

		
	}
