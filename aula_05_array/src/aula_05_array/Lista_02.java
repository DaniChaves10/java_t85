package aula_05_array;

import java.util.Scanner;

public class Lista_02 {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			
			int[][] matriz = new int[3][3];
			String diagonalPrincipal = "";
			String diagonalSecundaria = "";
			int somaPrincipal = 0;
			int somaSecundaria = 0;
		
			System.out.println("Digite os elementos da matriz: ");
			for (int linha = 0; linha < 3; linha++) {
			    for (int coluna = 0; coluna < 3; coluna++) {
			        matriz[linha][coluna] = leia.nextInt();
			    }
			}
			
			for (int linha = 0; linha < 3; linha ++) {
				for (int coluna = 0; coluna < 3; coluna ++) {
				if (linha == coluna) {
				diagonalPrincipal += matriz[linha][coluna] + " ";
				somaPrincipal += matriz[linha][coluna];
				} if (linha + coluna == 2) {
				diagonalSecundaria += matriz[linha][coluna] + " ";
				somaSecundaria += matriz[linha][coluna];}
				}
			}
		
		
		
		System.out.println("Elementos da Diagonal Principal: " + diagonalPrincipal);
		
		System.out.println("Elementos da Diagonal Secundária: " + diagonalSecundaria);
		
		System.out.println("Soma dos elementos da Diagonal Principal: " + somaPrincipal);
		
		System.out.println("Soma dos elementos da Diagonal Secundario: " + somaSecundaria);
	}

}
