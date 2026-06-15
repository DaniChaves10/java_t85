import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		// Variáveis
		String nome;
		int idade;
		boolean autorizacao = false;
		
		// Entrada de dados
		System.out.print("Digite o nome da Pessoa: ");
		nome = leia.nextLine();
		
		System.out.print("Digite a Idade: ");
		idade = leia.nextInt();
		
		if(idade <18) {
		System.out.print("A Pessoa possui Autorização dos Responsáveis? (true/false): ");
		autorizacao = leia.nextBoolean();
		}
		
		System.out.println("\n--- RESULTADO DO ACESSO ---");
		
		// Estrutura de decisão
		if(idade >= 18) {
			System.out.println("Acesso liberado para " + nome);
		} else if(autorizacao) {
			System.out.println("Acesso liberado com autorização " + nome);
		} else {
			System.out.println("Acesso negado para " + nome);
		}
		
		// Fechamento 
		leia.close();

	}

}