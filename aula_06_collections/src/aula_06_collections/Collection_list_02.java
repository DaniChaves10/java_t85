package aula_06_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collection_list_02 {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroProcurado = leia.nextInt();
		
		if (setNumeros.contains(numeroProcurado)) {
			System.out.printf("\nO número %d foi encontrado!\n", numeroProcurado);
		} else {
			System.out.printf("\nO número %d não foi encontrado!\n", numeroProcurado);
		}
		
		leia.close();
	}
}