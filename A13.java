package com;



public class A13 {

	public static void main(String[] args) {
		int[] tabla = {3,5,71,4,9,99,1,0};
	System.out.println(maximo(tabla));
		
	}
	
	public static int maximo (int[] tablas_numeros) {
		int max = Integer.MIN_VALUE;
		for(int numeros : tablas_numeros) {
			if(numeros > max) {
				max = numeros;
			}
		}
		return max;
	}

}
