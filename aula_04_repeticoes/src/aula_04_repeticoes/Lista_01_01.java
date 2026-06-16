package aula_04_repeticoes;

import java.util.Scanner;

public class Lista_01_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int inicio, fim;
		
		System.out.println("=====================================================");
		System.out.println("        Analisador de Múltiplos de 3 e 5             ");
		System.out.println("     [Instrução: O primeiro número DEVE ser menor]   ");
		System.out.println("   [que o segundo número para o intervalo ser válido]");
		System.out.println("=====================================================\n");
		
		System.out.print("Digite o primeiro número do intervalo: ");
		inicio = leia.nextInt();
		System.out.print("Digite o último número do intervalo: ");
		fim = leia.nextInt();
		
		if (inicio >= fim) {
			System.out.println("\nIntervalo inválido!");
			leia.close();
			return;
		}
		
		System.out.println("\nNo intervalo entre " + inicio + " e " + fim);
		
		for (int i = inicio; i <= fim; i ++) {
			if (i %3 == 0 && i %5 == 0) {
				System.out.println(i + " é múltiplo de 3 e 5");
			}
		}
		
		leia.close();

	}

}
