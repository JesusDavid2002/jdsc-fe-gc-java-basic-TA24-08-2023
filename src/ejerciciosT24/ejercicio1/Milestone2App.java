package ejerciciosT24.ejercicio1;

import java.util.Scanner;

public class Milestone2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int x = 5;
		for(int i = 1; i <= x; i++) {
			for (int j = 1; j <= x - i; j++) { 
				System.out.print(""); 
			}
			for (int k = i; k >= 1; k--) { 
				System.out.print((k >=10) ?+ k : " " + k);
			}
			System.out.println();
		}
		
		Scanner scn = new Scanner (System.in);
		System.out.println("¿De cuanto quieres la piramide de alto?");
		int altura = scn.nextInt();
		
		for(int i = altura; i >= 1; i--) {
			for (int j = 1; j <= x - i; j++) { 
				System.out.print(" "); 
			}
			
			for (int k = i; k >= 1; k--) { 
				System.out.print((k >= 10) ?+ k : " * " );
			}
			
			System.out.println();
		}
		
		scn.close();
	}

}
