package com;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime de cuantos numeros tiene la tabla: ");
		int n = sc.nextInt();
		int[] t = new int [n];
		for (int i = 0; i < t.length; i++) {
			
			System.out.print("Dime un número: ");
			t[i] = sc.nextInt();
			}
		for(int i = n - 1; i >= 0; i--) {
			System.out.println(t[i]);
		}
		
	}

}
