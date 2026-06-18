package aula_06_collections;

import java.util.ArrayList;
import java.util.Collections; // Necessário importar para usar a ordenação
import java.util.Scanner;

public class Collections_List_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		// aceitar o nome das cores
		ArrayList<String> lista = new ArrayList<String>();
		String cor;
		
		// Laço para ler as 5 cores
		for(int contador = 1; contador <= 5; contador ++) {
			System.out.printf("Digite a " + contador + "° cor: ");
			cor = leia.nextLine().toUpperCase(); // .toUpperCase() para não ter problema com letras M ou m
			lista.add(cor);
		}
		
		// Exibe a lista na ordem original em que foi digitada
		System.out.println("\nListar todas as cores: ");
		for(String elemento : lista) {
			System.out.println(elemento);
		}
		
		// Collections.sort organiza em ordem alfabética
		Collections.sort(lista);
		
		System.out.println("\nOrdenas as cores: ");
		for(String elemento : lista) {
			System.out.println(elemento);
		}
		
		leia.close();

	}
}
