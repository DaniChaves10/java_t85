package aula_05_array;

import java.util.Scanner;

public class Lista_02_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double [][] notas = new double [10] [4];
		double [] medias = new double [10];
		
		System.out.println("Digite as notas dos participantes: ");
		for (int linha = 0; linha < notas.length; linha++) {
		System.out.println("Digite as 4 notas do Participante " + (linha + 1) + ":");
			double somaNotas = 0;
		    for (int coluna = 0; coluna < notas[linha].length; coluna++) {
		        notas[linha][coluna] = leia.nextDouble();
		        somaNotas += notas[linha][coluna];
		    }
		    medias[linha] = somaNotas / 4;
		}
		System.out.println("\nSAÍDA:");
		for (int i = 0; i < medias.length; i++) {
		    System.out.printf("%.1f ", medias[i]);
		  }
		leia.close();
	}

}
