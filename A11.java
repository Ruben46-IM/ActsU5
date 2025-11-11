package com;

public class A11 {
		 static int[][] matrizMagica = {{1,15,14,4},{12,6,7,9},{8,10,11,5},{13,3,2,16}};
		    public static void main(String [] args) {
		    	
		    	try {
		    		System.out.println(sumaFila(matrizMagica, 3));
		    	}catch(Exception e) {
		    		System.out.print(e.toString());
		    	}
		    	
		    }
		    public static int sumaColumna(int[][] matriz, int posicion) {
		    	int acumulador = 0;
		    	for(int[] fila : matriz) {
		    	acumulador += fila[posicion];	
		    	}
		    	return acumulador;
		    }
		    
		    public static int sumaFila(int[][] matriz , int posicion ) throws Exception {
		    	
		    	if(posicion >=matriz.length) {
		    		throw new Exception("Fuera de rango");
		    	}
		    	
		    	int [] fila = matriz[posicion];
		    	int acumulador = 0;
		    	for(int numero : fila) {
		    		acumulador+=numero;
		    	}
		    	return acumulador;
		    }
		    
		}
