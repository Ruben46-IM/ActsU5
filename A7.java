package com;

import java.util.Arrays;
import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime 6 numeros para cada tabla");
		int [] t1 = new int [6];
		int [] t2 = new int [6];
		for (int i1 = 0; i1 < t1.length; i1++) {
			
			System.out.print("Dime los numeros: ");
			t1[i1] = sc.nextInt();
		}
			Arrays.sort(t1);
			System.out.println("Tabla 1: " + Arrays.toString(t1));
			
			for (int i2 = 0; i2 < t2.length; i2++) {
				
				System.out.print("Dime los numeros: ");
				t2[i2] = sc.nextInt();
			}
				Arrays.sort(t2);
				System.out.println("Tabla 2: " + Arrays.toString(t2));
				
				int[] t3 = new int [t1.length + t2.length];
			
			
			}
				
		 
	}


