package aula_04_repeticoes;

import java.util.Scanner;

public class Lista_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero, totalPar = 0, totalImpar = 0;
		
		for(int contador = 1; contador <= 10; contador ++) {
			System.out.printf("Digite o %d° número: ", contador);
			numero = leia.nextInt();
			if (numero % 2 == 0) {
				totalPar ++;
			} else {
				totalImpar ++;
			}
		}
		
		System.out.println("\nTotal de números pares: " + totalPar);
		System.out.println("\nTotal de números ímpares: " + totalImpar);
		
		leia.close();

	}

}
