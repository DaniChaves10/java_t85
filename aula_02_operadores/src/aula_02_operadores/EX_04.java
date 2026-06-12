package aula_02_operadores;

import java.util.Scanner;

public class EX_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.print("Digite o Número 1: ");
		n1 = leia.nextFloat();
		
		System.out.print("Digite o Número 2: ");
		n2 = leia.nextFloat();
		
		System.out.print("Digite o Número 3: ");
		n3 = leia.nextFloat();
		
		System.out.print("Digite o Número 4: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("Diferença: %.2f\n", diferenca);
		
		leia.close();

	}

}
