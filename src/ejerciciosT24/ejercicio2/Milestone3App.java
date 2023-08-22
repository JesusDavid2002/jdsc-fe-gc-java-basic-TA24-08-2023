package ejerciciosT24.ejercicio2;

import java.util.Scanner;

public class Milestone3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

        System.out.print("Introdueix la longitud de la seqüència de Fibonacci: ");
        int longitud = scn.nextInt();

        scn.close();

        int[] fibonacciArray = generateFibonacciSequence(longitud);

        System.out.println("Seqüència de Fibonacci: ");
        for (int numero : fibonacciArray) {
            System.out.print(numero + " ");
        }
    }

    public static int[] generateFibonacciSequence(int length) {
    	
        int[] sequence = new int[length];
        if (length >= 1) {
            sequence[0] = 0;
        }
        if (length >= 2) {
            sequence[1] = 1;
        }
        for (int i = 2; i < length; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
        return sequence;
    }
    
}

