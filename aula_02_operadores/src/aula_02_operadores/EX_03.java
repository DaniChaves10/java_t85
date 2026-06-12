package aula_02_operadores;

import java.util.Scanner;

public class EX_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in); 
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.print("Digite o Salário Bruto: R$ ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Digite o Adicional Noturno: R$ ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Digite as Horas Extras: R$ ");
		horasExtras = leia.nextFloat();
		
		System.out.print("Digite os Descontos: R$ ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("Salário Liquido: %.2f\n", salarioLiquido);
		
		leia.close();

	}

}
