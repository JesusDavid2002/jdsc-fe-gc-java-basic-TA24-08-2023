package ejerciciosT24.ejercicio3;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Milestone3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			
			try {
				int plato = scn.nextInt();
				
				if(plato <= platoMenu.length) {
					comanda.add(String.valueOf(plato));
				}else {
					System.out.println("\nEse plato que acaba de elegir no esta en el menú, seleccione otro");
					plato = scn.nextInt();
				}
				
			}catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("\nEse plato que acaba de elegir no esta en el menú.");
				
			}
			
			
			System.out.println("Excelente elección. \n ¿Desea algo más? (1: Si - 0: No)");
			
			
			try{
				int opcion = scn.nextInt();
				
				if(opcion == 0) {
					pedir = false;
					
				}else if(opcion == 1) {
					pedir = true;
					
				}else {
					System.out.println("Eso no es una de las opciones. Vuelve a elegir: ");
					opcion = scn.nextInt();
					
				}
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("\nEso no es una de las opciones. ");
				
			}
			
			
		}
		
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