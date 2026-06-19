package aula_07_metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class EX_03_Atividade_Pratica {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		ArrayList<String> nomeProduto = new ArrayList<String>();
		ArrayList<Integer> quantidadeProduto = new ArrayList<Integer>();
		int opcao;
		
		System.out.println("    1 - Adicionar um Novo Produto                ");
		System.out.println("    2 - Atualizar Quantidade de um Produto       "); 
		System.out.println("    3 - Listar Todos os Produtos                 "); 
		System.out.println("    4 - Remover um Produto do Estoque            "); 
		System.out.println("    0 - Sair                                     ");
		System.out.println("*************************************************");
		
		do {
			System.out.print("Entre uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
			case 1: 
				System.out.print("\nDigite o nome do Produto: ");
				String nome = leia.nextLine();
				nomeProduto.add(nome);
				System.out.print("\nDigite a Quantidade: ");
				int quantidade = leia.nextInt();
				quantidadeProduto.add(quantidade);
				System.out.println("\nProduto Cadastrado com  Sucesso!\n");
				break;
			case 2:
				System.out.println("\n*** Atualizar estoque! ***");
				if (nomeProduto.isEmpty()) {
					System.out.println("O estoque está completamente vazio!");
				} else {
					System.out.print("Digite o nome do produto que deseja atualizar: ");
					String produtoProcurado = leia.nextLine();
					
					int indiceEncontrado = -1;
					
					for (int i = 0; i < nomeProduto.size(); i++) {
					    if (nomeProduto.get(i).equalsIgnoreCase(produtoProcurado)) {
					        indiceEncontrado = i; 
					        break;
					    }
					}
					
					if (indiceEncontrado != -1) { 						
						System.out.print("Digite a NOVA quantidade para o produto " + produtoProcurado + ": ");
						int novaQuantidade = leia.nextInt();
						
						quantidadeProduto.set(indiceEncontrado, novaQuantidade); 
						System.out.println("\nEstoque atualizado com sucesso!\n");
					} else {
						System.out.println("\nProduto não encontrado no estoque!\n");
					}
						}
						break;
				
			case 3: 
				System.out.println("\n*** Produtos em Estoque ***");
				if (nomeProduto.isEmpty()) {
					System.out.println("O estoque está vazio!");
				} else {
					for (int i = 0; i < nomeProduto.size(); i++) {
						System.out.println("Produto: " + nomeProduto.get(i) + " | Quantidade: " + quantidadeProduto.get(i));
					}
				}
				System.out.println();
				break;
			case 4: 
				System.out.println("\n*** Remover Produto ***");
				if (nomeProduto.isEmpty()) {
					System.out.println("O estoque está vazio! Não há o que remover.\n");
				} else {
					System.out.print("Digite o nome do produto que deseja remover: ");
					String produtoRemover = leia.nextLine();
					
					int indiceRemover = -1;
					
					for (int i = 0; i < nomeProduto.size(); i++) {
						if (nomeProduto.get(i).equalsIgnoreCase(produtoRemover)) {
							indiceRemover = i;
							break;
							}
					}
					
					if (indiceRemover != -1) {
						String produtoApagado = nomeProduto.remove(indiceRemover);
						quantidadeProduto.remove(indiceRemover);
						
						System.out.println("\nO produto '" + produtoApagado + "' foi removido com sucesso!\n");
					} else {
						System.out.println("\nProduto não encontrado no estoque!\n");
					}
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nOpção inválida! Tente novamente.\n");
				break;
			}
		} while (opcao != 0);
		
		leia.close();

	}

}
