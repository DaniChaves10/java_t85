package aula_03_condicionais;

import java.util.Scanner;

public class EX_01_Lista_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int produto;
		int quantidade;
		String nomeProduto = "";
		float preco = 0.0f;
		float valorTotal;
		
		System.out.println("**********************************");
		System.out.println("             PRODUTOS             ");
		System.out.println("**********************************");
		System.out.println("                                  ");
		System.out.println("    1 - CACHORRO QUENTE   R$10,00 ");
		System.out.println("       2 - X-SALADA   R$15,00     ");
		System.out.println("        3 - X-BACON   R$18,00     ");
		System.out.println("         4 - BAURU  R$12,00       ");
		System.out.println("     5 - REFRIGERANTE R$8,00      ");
		System.out.println("    6 - SUCO DE LARANJA  R$13,00  ");
		System.out.println("                                  ");
		System.out.println("**********************************");
		
		System.out.println("Escolha o seu Produto: ");
		produto = leia.nextInt();
		
		System.out.println("Escolha a sua Quantidade: ");
		quantidade = leia.nextInt();
		
		switch(produto) {
		case 1: 
			nomeProduto = "Cachorro Quente";
			preco = 10.00f;
			break;
		case 2:
			nomeProduto = "X-Salada";
			preco = 15.00f;
			break;
		case 3:
			nomeProduto = "X-Bacon";
			preco = 18.00f;
			break;
		case 4:
			nomeProduto = "Bauru";
			preco = 12.000f;
			break;
		case 5:
			nomeProduto = "Refrigerante";
			preco = 8.00f;
			break;
		case 6:
			nomeProduto = "Suco de laranja";
			preco = 13.00f;
			break;
		default:
			System.out.println("Código do produto inválido!");
			
			leia.close();
			return;
		}
		
		valorTotal = quantidade * preco;
		
		System.out.println("\nProduto: " + nomeProduto);
		System.out.printf("Valor total: R$ %.2f\n", valorTotal);
		
		leia.close();

	}

}
