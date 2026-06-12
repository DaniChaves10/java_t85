package aula_02_operadores;

import java.util.Scanner;

public class EX_01 {
	
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in); 
			
			float salario, abono, novoSalario;
			
			System.out.print("Digite o Salário: R$ ");
			salario = leia.nextFloat();
			
			System.out.print("Digite o Abono: R$ ");
			abono = leia.nextFloat();
			
			novoSalario = salario + abono;
			
			System.out.printf("novo Salário = %.2f\n", novoSalario);
			
			leia.close();

		}

	}
