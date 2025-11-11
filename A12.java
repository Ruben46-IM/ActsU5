package com;

public class A12 {

	public static void main(String[] args) {
	final int FILAS = 5;
	final int COLUMNAS = 5;
	int[][] tabla = crearMatriz(FILAS, COLUMNAS);
	}

	public static int[][] crearMatriz(int filas, int columnas){
		int[][] matriz = new int [filas][columnas];
		
		for(int f = 0; f<filas;f++) {
			for(int c = 0; c < columnas; c++){
				matriz[f][c] = f + c;
			}
		}
		return matriz;
	}
	
	public static void mostrarMatriz(int[][] matriz) {
		for(int f = 0; f < matriz.length; f++) {
			for(int c = 0; c < matriz.length; c++) {
				System.out.println(matriz[f][c]);
			}
		}
		System.out.println("\n");
	}
}
