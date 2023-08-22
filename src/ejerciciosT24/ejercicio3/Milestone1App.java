package ejerciciosT24.ejercicio3;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Milestone1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fase 1
		Scanner scn = new Scanner (System.in);
		int billete5 = 5;
		int billete10 = 10;
		int billete20 = 20;
		int billete50 = 50;
		int billete100 = 100;
		int billete200 = 200;
		int billete500 = 500;
		
		int precioTotal = 0;
		
		String[] platoMenu = new String[3];
		double[] precioPlato = new double[platoMenu.length];
		
		// Fase 2
		Hashtable<String, Double> menu = new Hashtable<String, Double>();
		
		for(int i = 0; i < platoMenu.length; i++) {
			System.out.println("Introduce el " + (i + 1) + " plato: ");
			platoMenu[i] = scn.next();
			
			System.out.println("Introduce el precio del plato");
			precioPlato[i] = scn.nextDouble();
			
			menu.put(platoMenu[i], precioPlato[i]);
			
		}
		
		List<String> comanda = new ArrayList<>();
		boolean pedir = true;
		
		while(pedir) {
			System.out.println("Menú del día");
			System.out.println("-----------------------------");
			
			for(int i = 0; i < platoMenu.length; i++) {
				System.out.println((i + 1) + ". " + platoMenu[i] + " - " + precioPlato[i]);
				
			}
			
			System.out.println("¿Que plato le gustaría tomar? ");
			int plato = scn.nextInt();
			comanda.add(String.valueOf(plato));
			
			System.out.println("Excelente elección. \n ¿Desea algo más? (1: Si - 0: No)");
			int opcion = scn.nextInt();
			
			if(opcion == 0) {
				pedir = false;
			} 
		}
		
		// Fase 3
		for(String plato: comanda) {
			if(menu.containsKey(plato)) {
				precioTotal += menu.get(plato);
				
			}else {
				System.out.println("El plato " + plato + " no existe en el menú.");
			}
			
		}
		
		System.out.println("Aquí tiene su cuenta: " + precioTotal + "€");
		scn.close();
	}

}
