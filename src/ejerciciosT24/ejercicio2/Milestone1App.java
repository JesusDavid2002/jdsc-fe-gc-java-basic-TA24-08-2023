package ejerciciosT24.ejercicio2;

import java.util.*;

public class Milestone1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fase 1
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		StringBuilder sb4 = new StringBuilder();
		StringBuilder sb5 = new StringBuilder();
		StringBuilder sb6 = new StringBuilder();
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Introduce el nombre de la primera ciudad: ");
		sb1.append(scn.next());

		System.out.println("Introduce el nombre de la segunda ciudad: ");
		sb2.append(scn.next());

		System.out.println("Introduce el nombre de la tercera ciudad: ");
		sb3.append(scn.next());

		System.out.println("Introduce el nombre de la cuarta ciudad: ");
		sb4.append(scn.next());

		System.out.println("Introduce el nombre de la quinta ciudad: ");
		sb5.append(scn.next());

		System.out.println("Introduce el nombre de la sexta ciudad: ");
		sb6.append(scn.next());
		
		scn.close();
		
		System.out.println("Primera ciudad: " + sb1 + ". \nSegunda ciudad: " + sb2  +". \nTercera ciudad: " + sb3+
							". \nCuarta ciudad: " + sb4 + ". \nQuinta ciudad: " + sb5 + ". \nSexta ciudad: " + sb6);
		
		// Fase 2
		StringBuilder[] arrayCiudades = new StringBuilder[6];
		
		arrayCiudades[0] = sb1;
		arrayCiudades[1] = sb2;
		arrayCiudades[2] = sb3;
		arrayCiudades[3] = sb4;
		arrayCiudades[4] = sb5;
		arrayCiudades[5] = sb6;
		
		Arrays.sort(arrayCiudades, new Comparator<StringBuilder>() {
			@Override
			public int compare(StringBuilder sb1, StringBuilder sb2) {
				return sb1.toString().compareTo(sb2.toString());
			}
		});
		
		System.out.println("Ciudades ordenadas: ");
		for(StringBuilder ciudad: arrayCiudades) {
			System.out.println(ciudad);
		}
		System.out.println("-------------------");
		
		
		// Fase 3
		StringBuilder[] arrayCiudadesModif = new StringBuilder[6];
		
		for(int i = 0; i < arrayCiudades.length; i++) {
			
			StringBuilder ciudadModif = new StringBuilder(arrayCiudades[i]);
			ciudadModif = replaceA(ciudadModif);
			arrayCiudadesModif[i] = ciudadModif;
		}
		
		Arrays.sort(arrayCiudadesModif, new Comparator<StringBuilder>() {
            @Override
            public int compare(StringBuilder sb1, StringBuilder sb2) {
                return sb1.toString().compareTo(sb2.toString());
            }
        });

        System.out.println("Ciudades modificadas y ordenadas:");
        for (StringBuilder ciudad : arrayCiudadesModif) {
            System.out.println(ciudad);
        }

		System.out.println("-------------------");
        
        // Fase 4
        StringBuilder[] arrayCiudadesInvertidas = new StringBuilder[6];

        for (int i = 0; i < arrayCiudades.length; i++) {
            StringBuilder ciudadInvertida = new StringBuilder();

            for (int j = arrayCiudades[i].length() - 1; j >= 0; j--) {
                ciudadInvertida.append(arrayCiudades[i].charAt(j));
            }

            arrayCiudadesInvertidas[i] = ciudadInvertida;
        }

        // Ordena l'array de ciutats invertides alfabèticament
        Arrays.sort(arrayCiudadesInvertidas, new Comparator<StringBuilder>() {
            @Override
            public int compare(StringBuilder sb1, StringBuilder sb2) {
                return sb1.toString().compareTo(sb2.toString());
            }
        });

        System.out.println("Noms de ciutats invertits i ordenats:");
        for (StringBuilder ciudad : arrayCiudadesInvertidas) {
            System.out.println(ciudad);
        }
        
		System.out.println("-------------------");

	}

	private static StringBuilder replaceA(StringBuilder ciudadModif) {
		// TODO Auto-generated method stub
		for(int i = 0; i < ciudadModif.length(); i++) {
			
			char c = ciudadModif.charAt(i);
			if(c == 'a' || c == 'A') {
				ciudadModif.setCharAt(i, '4');
			}
		}
		
		return ciudadModif;
	}

}
