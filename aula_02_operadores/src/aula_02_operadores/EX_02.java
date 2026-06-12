package aula_02_operadores;

import java.util.Scanner;

public class EX_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.print("Digite a Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Digite a Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Digite a Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Digite a Nota 4: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Média Final: %.1f\n", mediaFinal);
		
		leia.close();

	}

}
