package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade_Fila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Queue<String> nomes = new LinkedList<String>();
		int opcao;
		
		System.out.println("    1 - Adicionar Cliente na Fila                    ");
		System.out.println("    2 - Listar todos os Clientes                     ");
		System.out.println("    3 - Retirar Cliente da Fila                      ");
		System.out.println("    0 - Sair                                         ");
		System.out.println("*****************************************************");
		
		do {
			System.out.print("Entre uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
			case 1: 
				System.out.print("\nDigite o nome do cliente: ");
				String nomeCliente = leia.nextLine();
				nomes.add(nomeCliente); System.out.println("\nFila: ");
				for (String cliente : nomes) {
					System.out.println(cliente);
				}
				System.out.println("\nCliente Adicionado!\n");
				break;
			case 2:
				System.out.println("\nLista de Clientes na Fila:");
				if (nomes.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					for (String cliente : nomes) {
						System.out.println(cliente);
					}
				}
				System.out.println();
				break;
			case 3:
				if (nomes.isEmpty()) {
					System.out.println("\nA Fila está vazia!\n");
				} else {
					String chamado = nomes.poll();
					System.out.println("\nFila: ");
					for (String cliente : nomes) {
						System.out.println(cliente);
					}
					System.out.println("\nO Cliente " + chamado + " foi chamado!\n");
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
