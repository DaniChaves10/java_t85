package aula_04_repeticoes;

import java.util.Scanner;

public class Lista_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero, somaPositivos = 0;
		
		System.out.println("=====================================================");
		System.out.println("              Somador de Números Positivos           ");
		System.out.println("   [Instrução: Digite o número 0 para encerrar]      ");
		System.out.println("=====================================================\n");
		
	do {
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
			if (numero > 0) {
				somaPositivos += numero;
			}
	} while (numero != 0);
		
		System.out.println("\nA soma dos números positivos é: " + somaPositivos);
	
		leia.close();

	}

}
