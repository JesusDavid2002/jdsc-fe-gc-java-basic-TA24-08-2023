package ejerciciosT24.ejercicio1;

import java.util.*;

public class Milestone1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Parte 1
		char[] nombre = {'J','e','s','u','s'};
		
		for(int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);
			
		}
		
		// Parte 2
		List<Character> nombreLista = new ArrayList <>();
		nombreLista.add('J');
		nombreLista.add('e');
		nombreLista.add('s');
		nombreLista.add('u');
		nombreLista.add('s');
		nombreLista.add('5');
		
		
		for(char c : nombreLista) {
			
			if(esVocal(c)) {
				System.out.println("VOCAL");
				
			} else if (esConsonante(c)) {
				System.out.println("CONSONANTE");
				
			}else {
				System.out.println("Los nombres de las personas no tienen números");
				
			}
		}
		
		// Parte 3
		Map<Character, Integer> mapa = contarLetras(nombreLista);
		
		for(Map.Entry<Character, Integer> entry: mapa.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		// Parte 4
		List<Character> apellidoLista = new ArrayList <>();
		apellidoLista.add('S');
		apellidoLista.add('e');
		apellidoLista.add('p');
		apellidoLista.add('u');
		apellidoLista.add('l');
		apellidoLista.add('v');
		apellidoLista.add('e');
		apellidoLista.add('d');
		apellidoLista.add('a');
		
		List<Character> nombreCompleto = new ArrayList <>();
		nombreCompleto.addAll(nombreLista);
		nombreCompleto.add(' ');
		nombreCompleto.addAll(apellidoLista);
		System.out.println("FullName: " + nombreCompleto);
	}
	
	// Parte 2
	private static boolean esConsonante(char c) {
		// TODO Auto-generated method stub
		c = Character.toLowerCase(c);
		return (c >= 'a' && c <= 'z') && !esVocal(c);
	}

	private static boolean esVocal(char c) {
		// TODO Auto-generated method stub
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
	
	// Parte 3
	private static Map<Character, Integer> contarLetras(List<Character> nombreLista) {
		// TODO Auto-generated method stub
		Map<Character, Integer> mapa = new HashMap<>();
		
		for(char letra: nombreLista) {
			
			if(mapa.containsKey(letra)) {
				mapa.put(letra, mapa.get(letra) + 1);
				
			} else {
				mapa.put(letra, 1);
				
			}
		}
		
		return mapa;
	}

	

}
