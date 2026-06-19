package aula_07_metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class EX_01_Atividade_Pratica {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		ArrayList<Integer> colecaoNumeros = new ArrayList<Integer>();
		
		System.out.println("*** COLEÇÃO DE NÚMEROS E ANÁLISE ***\n");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o " + i + "º número: ");
			int numero = leia.nextInt();
			colecaoNumeros.add(numero); 
		}
		
		
		System.out.println("Coleção de números: " + colecaoNumeros);
		
		analisarColecao(colecaoNumeros);
		
		leia.close();

	}
	
		public static void analisarColecao(ArrayList<Integer> lista) {
		int soma = 0;
		int maiorValor = lista.get(0);
	
		for (int numero : lista) {
			soma += numero; 
			
			if (numero > maiorValor) {
				maiorValor = numero;
	}

}
		
		double media = (double) soma / lista.size();
		
		
		System.out.println("Soma: " + soma + "\nMédia: " + media + "\nMaior valor: " + maiorValor);
	}
}
