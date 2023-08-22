package ejerciciosT24.ejercicio2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Milestone2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat (".00");
		double nota;
		double media = 0;
		double total = 0;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Nombre de la alumna: ");
			String nombre = scn.next();
			
			for(int j = 1 ; j < 4; j++) {

				System.out.println(j + "r nota");
				nota = scn.nextDouble();
				
				if(nota >= 0 && nota <= 10) {
					media += nota; 
					total = media / 3;
					
				} else {
					System.out.println("Ese valor no es una nota valida. Intentalo otra vez: ");
					nota = scn.nextDouble();
				}
				
				
			}
			if(total >= 5) {
				System.out.println("La alumna " + nombre + " a aprobado con un: " + df.format(total));
				
			}else {
				System.out.println("La alumna " + nombre + " a suspendido con un: " + df.format(total));
				
			}
		}
		
		scn.close();
	}

}
