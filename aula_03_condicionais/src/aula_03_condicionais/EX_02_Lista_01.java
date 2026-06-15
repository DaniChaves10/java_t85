package aula_03_condicionais;

import java.util.Scanner;

public class EX_02_Lista_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int idade;
		boolean doacao;
		
		System.out.println("Digite o Nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		doacao = leia.nextBoolean();
		
		if(idade >= 60 && idade <= 69 && doacao == true) {
			System.out.println(nome + " Não está apto(a) para doar sangue!");
		} else if(idade >= 18 && idade <= 69) {
			System.out.println(nome + " Está apto(a) para doar sangue!");
		} else{
			System.out.println(nome + " Não está apto(a) para doar sangue!");
		} 
		
		leia.close();
	}

}
