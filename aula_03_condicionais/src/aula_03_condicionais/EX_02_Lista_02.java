package aula_03_condicionais;

import java.util.Scanner;

public class EX_02_Lista_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nomeColaborador;
		int codigoCargo;
		float salario;
		float reajuste = 0.0f;
		String nomeCargo = "";
		float novoSalario;
		
		System.out.print("Nome do colaborador: ");
		nomeColaborador = leia.nextLine(); 
		
		System.out.print("Código do Cargo: ");
		codigoCargo = leia.nextInt();
		
		System.out.print("Salário atual: R$ ");
		salario = leia.nextFloat();
	
		switch (codigoCargo) {
			case 1:
				nomeCargo = "Gerente";
				reajuste = 0.10f; 
				break;
			case 2:
				nomeCargo = "Vendedor";
				reajuste = 0.07f; 
				break;
			case 3:
				nomeCargo = "Supervisor";
				reajuste = 0.09f; 
				break;
			case 4:
				nomeCargo = "Motorista";
				reajuste = 0.06f; 
				break;
			case 5:
				nomeCargo = "Estoquista";
				reajuste = 0.05f; 
				break;
			case 6:
				nomeCargo = "Técnico de TI";
				reajuste = 0.08f; 
				break;
			default:
				System.out.println("Código de cargo inválido!");
				leia.close();
				return;
		}

		novoSalario = salario + (reajuste * salario);
		
		System.out.println("\nNome do colaborador: " + nomeColaborador);
		System.out.println("Cargo: " + nomeCargo);
		System.out.printf("Salário reajustado: R$ %.2f\n", novoSalario);
		
		leia.close();
	}
}