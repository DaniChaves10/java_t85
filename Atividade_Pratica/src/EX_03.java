import java.util.Scanner;

public class EX_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Variáveis
		double numero1, numero2;
		int operacao; 
		
		System.out.println("***** CALCULADORA *****");
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		// Exibição do menu de opções 
		System.out.println("\nCÓDIGO DA OPERAÇÃO:");
		System.out.println("1 – Soma");
		System.out.println("2 – Subtração");
		System.out.println("3 – Multiplicação");
		System.out.println("4 – Divisão");
		System.out.println("5 – Potenciação");
		System.out.println("6 – Raiz Quadrada");
		System.out.print("Escolha a operação desejada (1 a 6): ");
		operacao = leia.nextInt();
		
		System.out.println("\n***** RESULTADO *****");
		
		switch (operacao) {
			case 1:
				System.out.printf("Operação: Soma \nResultado: %.2f + %.2f = %.2f\n", numero1, numero2, numero1 + numero2);
				break;
			case 2:
				System.out.printf("Operação: Subtração  \nResultado: %.2f - %.2f = %.2f\n", numero1, numero2, numero1 - numero2);
				break;
			case 3:
				System.out.printf("Operação: Multiplicação  \nResultado: %.2f x %.2f = %.2f\n", numero1, numero2, numero1 * numero2);
				break;
			case 4:
				// Evita o erro de divisão por zero
				if (numero2 != 0) {
					System.out.printf("Operação: Divisão  \nResultado: %.2f / %.2f = %.2f\n", numero1, numero2, numero1 / numero2);
				} else {
					System.out.println("Erro: Não é possível dividir por zero!");
				}
				break;
			case 5:
				System.out.printf("Operação: Potenciação  \nResultado: %.2f ^ %.2f = %.2f\n", numero1, numero2, Math.pow(numero1, numero2));
				break;
			case 6:
				if (numero1 >= 0) {
					System.out.println("OBS: Para a Raiz Quadrada, apenas o primeiro número digitado foi considerado.");
					System.out.printf("Operação: Raiz Quadrada  \nResultado: √%.2f = %.2f\n", numero1, Math.sqrt(numero1));
				} else {
					System.out.println("Erro: Não existe raiz quadrada de número negativo!");
				}
				break;
			default:
				System.out.println("Erro: Código de operação inválido!");
				break;
		}
		
		leia.close();
	}
}