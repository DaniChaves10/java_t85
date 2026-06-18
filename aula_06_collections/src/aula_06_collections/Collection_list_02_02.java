package aula_06_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Collection_list_02_02 {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		System.out.println("=====================================================");
		System.out.println("******** ENTRADA DE DADOS  SET ********");
		System.out.println(" Digite 10 números inteiros não repetidos:");
		System.out.println("=====================================================\n");
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número: ", i);
			int numero = leia.nextInt();
			setNumeros.add(numero); 
		}
		
		System.out.println("\n=====================================================");
		System.out.println("******** SAÍDA - LISTAR DADOS DO SET ********");
		System.out.println("=====================================================");
		
		
		Iterator<Integer> iSetNumeros = setNumeros.iterator();
		
		
		while(iSetNumeros.hasNext()) {
			System.out.println(iSetNumeros.next());
		}
		
		leia.close();
	}
}
