package com;

import java.util.Arrays;
import java.util.Scanner;

public class A14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] combinacion = new int [6];
		int[] combinacionGanadora = {5,8,2,4,9,3};
		System.out.println("Dime tu conbinación");
		System.out.println("Dime los numeros del primero hasta el último");
		for(int i = 0; i < combinacion.length; i++) {
			System.out.println("Numero?");
			combinacion[i] = sc.nextInt();
			
		}
System.out.println(Arrays.toString(combinacion));

System.out.println(totalAciertos(combinacionGanadora, combinacion));
	}
	
	public static int totalAciertos(int[] tabla_combinacionG, int[] tabla_combinacion) {
		int aciertos = 0;
		for(int apuesta : tabla_combinacion) {
			if(seEncuentra(apuesta, tabla_combinacionG)) {
				aciertos++;
			}
		}
		return aciertos;
	}
	
	private static boolean seEncuentra(int apuesta, int[] tabla_combinacionG) {
		for(int n : tabla_combinacionG) {
			if(n == apuesta) {
				return true;
			}
		}
		return false;
	}

}
