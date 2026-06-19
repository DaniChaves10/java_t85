package aula_07_metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class EX_02_Atividade_Pratica {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		ArrayList<String> nomesAlunos = new ArrayList<String>();
		ArrayList<Integer> idadesAlunos = new ArrayList<Integer>();
		ArrayList<Double> notasAlunos = new ArrayList<Double>();
		int opcao;
		
		System.out.println("    1 - Adicionar um Aluno a uma Coleção             ");
		System.out.println("    2 - Listar todos os alunos cadastrados           ");
		System.out.println("    3 - Calcular a média geral das notas             ");
		System.out.println("    0 - Sair                                         ");
		System.out.println("*****************************************************");
		
		do {
			System.out.print("Entre uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
			case 1: 
				System.out.print("\nDigite o nome do aluno: ");
				String nome = leia.nextLine();
				nomesAlunos.add(nome); 
				System.out.print("\nDigite a idade do aluno: ");
				int idade = leia.nextInt();
				idadesAlunos.add(idade);
				System.out.print("Digite a nota final do aluno: ");
				double nota = leia.nextDouble();
				notasAlunos.add(nota);
				System.out.println("\nAluno adicionado com sucesso!\n");
				break;
			case 2:
				System.out.println("\n*** Lista de Alunos na Coleção ***");
				if (nomesAlunos.isEmpty()) {
					System.out.println("A Lista está vazia!");
				} else {
					for (int i = 0; i < nomesAlunos.size(); i++) {
						System.out.println("Aluno: " + nomesAlunos.get(i) + " | Idade: " + idadesAlunos.get(i) + " | Nota: " + notasAlunos.get(i));
					}
				}
				System.out.println();
				break;
			case 3:
				if (notasAlunos.isEmpty()) {
				System.out.println("\nNão há notas cadastradas para calcular a média!\n");
				} else {
					double mediaGeral = calcularMediaGeral(notasAlunos);
					System.out.printf("\nMédia geral das notas: %.2f\n", mediaGeral);
				}  break;
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
	public static double calcularMediaGeral(ArrayList<Double> notas) {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / notas.size();
	}
}
