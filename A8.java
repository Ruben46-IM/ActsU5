package com;

import java.util.Arrays;

public class A8 {

	public static void main(String[] args) {
	int [] tabla = {1,3,5,5,7,9,9,9,5};
	boolean dev = contiene(tabla, 6);
	System.out.println("6 > " + dev);

	}
	public static boolean contiene (int[] tabla, int valor){
		boolean ret = false;
		for(int i = 0; i < tabla.length; i++) {
			if(tabla[i] == valor) {
			}
		}
		return true;
	}
public static int[] sinRepetidos(int t[]) {
	int[] res = new int[1];
	res[0] = t[0];
	return res;
}
	
	public static int [] insertar(int[] tabla, int valor) {
	int[] nuevaTabla = Arrays.copyOf(tabla, tabla.length);
	nuevaTabla[nuevaTabla.length - 1] = valor; 
	return nuevaTabla;

	}
		
	}
	

