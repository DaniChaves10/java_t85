package aula_06_collections;

import java.util.Stack;
import java.util.Scanner;

public class Atividade_Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Stack<String> pilha = new Stack<String>();
		int opcao;
		
		System.out.println("    1 - Adicionar Livro na Pilha                     ");
		System.out.println("    2 - Listar todos os Livros                       ");
		System.out.println("    3 - Retirar Livros da Pilha                      ");
		System.out.println("    0 - Sair                                         ");
		System.out.println("*****************************************************");
		
		do {
			System.out.print("Digite uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
			case 1: 
				System.out.print("\nDigite o nome: ");
				String pilhaLivro = leia.nextLine();
				pilha.push(pilhaLivro);
				System.out.println("\nPilha: ");
				for (String pilhas : pilha) {
					System.out.println(pilhas);
				}
				System.out.println("\nLivro Adicionado!\n");
				break;
			case 2:
				System.out.println("\nLista de Livros na Pilha:");
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					for (String pilhas : pilha) {
						System.out.println(pilhas);
					}
				}
				System.out.println();
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!\n");
				} else {
					pilha.pop();
					System.out.println("\nPilha: ");
					for (String pilhas : pilha) {
						System.out.println(pilhas);
					}
					System.out.println("\nUm Livro foi retirado da pilha!\n");
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