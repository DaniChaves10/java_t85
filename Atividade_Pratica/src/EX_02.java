import java.util.Scanner;

public class EX_02 {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner (System.in);
			
		// Variáveis
		String nome;
		float nota1, nota2, media;
		
		// Entrada de Dados
		System.out.print("Digite o nome do aluno(a): ");
		nome = leia.nextLine();
			
		System.out.print("Digite a primeira nota (0 a 10): ");
        nota1 = leia.nextFloat();
        
        System.out.print("Digite a segunda nota (0 a 10): ");
        nota2 = leia.nextFloat();
            
        System.out.println("\n--- RESULTADO FINAL ---");
			
        // Validação das notas
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
			System.out.println("Erro: As notas digitadas devem estar entre 0 a 10!");
		} else {
			media = (nota1 + nota2) / 2;
		if (media >= 7) {
			System.out.println("Aluno: " + nome + " \nMédia: " + media + " \nSituação: Aprovado!!");
		} else if (media >= 5 && media < 7) {
			System.out.println("Aluno: " + nome + " \nMédia: " + media + " \nSituação: Recuperação!!");
		} else {
			System.out.println("Aluno: " + nome + " \nMédia: " + media + " \nSituação: Reprovado!!");
		}
		}
			
		// Final
        leia.close();
	}
}