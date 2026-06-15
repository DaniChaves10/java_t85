package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaudeCase {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int faixaEtaria;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("**********************************");
		System.out.println("            FAIXA ETÁRIA          ");
		System.out.println("**********************************");
		System.out.println("                                  ");
		System.out.println("   1 - DE 0 A 10 ANOS DE IDADE    ");
		System.out.println("   2 - DE 11 A 29 ANOS DE IDADE   ");
		System.out.println("   3 - DE 30 A 45 ANOS DE IDADE   ");
		System.out.println("   4 - DE 46 A 59 ANOS DE IDADE   ");
		System.out.println("   5 - DE 60 A 65 ANOS DE IDADE   ");
		System.out.println("   6 - MAIORES DE 65 ANOS         ");
		System.out.println("                                  ");
		System.out.println("**********************************");
		
		System.out.println("Escolha a sua Faixa Etária: ");
		faixaEtaria = leia.nextInt();
		
		System.out.printf("Nome: %s\n", nome);
		
		switch(faixaEtaria) {
			case 1:
				System.out.println("A Mensalidade do Plano é R$ 100,00");
			break;
			case 2:
				System.out.println("A Mensalidade do Plano é R$ 200,00");
			break;
			case 3:
				System.out.println("A Mensalidade do Plano é R$ 300,00");
			break;
			case 4:
				System.out.println("A Mensalidade do Plano é R$ 500,00");
			break;
			case 5:
				System.out.println("A Mensalidade do Plano é R$ 600,00");
			break;
			case 6:
				System.out.println("A Mensalidade do Plano é R$ 1000,00");
			break;
			default:
				System.out.println("Opção inválida!");
		}
		
		leia.close();

	}

}
