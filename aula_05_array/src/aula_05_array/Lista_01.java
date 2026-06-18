package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Lista_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int [10], soma = 0;
		float media = 0;
		
		for (int contador = 0; contador < vetor.length; contador ++) {
			System.out.printf("Digite o %d número inteiro: ", (contador + 1));
			vetor[contador] = leia.nextInt();
			soma += vetor[contador];
		}
		
		System.out.println("\nElementos nos índices ímpares: ");
		for (int i = 0; i < vetor.length; i ++) {
			if (i % 2 != 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		
		System.out.println("\nElementos pares: ");
		for (int i = 0; i < vetor.length; i ++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		
		media = (float) soma / vetor.length;
		
		System.out.println("\nSoma: " + soma);
		System.out.printf("Média: %.2f\n", media);
		
		leia.close();
	}

}
