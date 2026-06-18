package aula_06_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections_list_01_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(2);
		lista.add(5);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(7);
		lista.add(8);
		lista.add(10);
		lista.add(6);
		
		System.out.println("=====================================================");
		System.out.println("******** LIST                   ********");
		System.out.println(" Posições:  [0, 1, 2, 3, 4, 5, 6, 7, 8,  9]");
		System.out.println(" Números:   " + lista); 
		System.out.println("=====================================================\n");
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroProcurado = leia.nextInt();
		
		if(lista.contains(numeroProcurado)) {
			int posicao = lista.indexOf(numeroProcurado);
		System.out.printf("\nO número %d está localizado na posição: %d\n", numeroProcurado, posicao);
		} else {
			System.out.printf("\nO número %d não foi encontrado!\n", numeroProcurado);
		}
		
		leia.close();
	}

}
