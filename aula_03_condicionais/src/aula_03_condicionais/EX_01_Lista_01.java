package aula_03_condicionais;

import java.util.Scanner;

public class EX_01_Lista_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numeroA, numeroB, numeroC;
		int soma;
		
		System.out.println("Digite o Número A: ");
		numeroA = leia.nextInt();
		
		System.out.println("Digite o Número B: ");
		numeroB = leia.nextInt();
		
		System.out.println("Digite o Número C: ");
		numeroC = leia.nextInt();
		
		soma = numeroA + numeroB;
		
		if ((numeroA + numeroB) > numeroC) {
			System.out.printf("%d + %d = %d > %d\n", numeroA, numeroB, soma, numeroC);
			System.out.println("A soma de A + B é maior do que C");
			
			
		} else if ((numeroA + numeroB) < numeroC) {
			System.out.printf("%d + %d = %d < %d\n", numeroA, numeroB, soma, numeroC);
			System.out.println("A soma de A + B é menor do que C");
		    
		} else {
			System.out.printf("%d + %d = %d = %d\n", numeroA, numeroB, soma, numeroC);
			System.out.println("A soma de A + B é igual do que C");
		    
		}
		
		

	}

}
