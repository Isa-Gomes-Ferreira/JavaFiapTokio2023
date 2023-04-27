package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		//Solicitação da peça 1
		System.out.print("Digite o nome da primeira peça: ");
		String peca1 = entrada.nextLine();
		
		System.out.print("Digite a quantidade de peças que você deseja: ");
		int quantPeca1 = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Digite o valor unitário dessa peça: ");
		double valor1 = Double.parseDouble(entrada.nextLine());
		

		//Solicitação  da peça 2
		System.out.print("\nDigite o nome da segunda peça: ");
		String peca2 = entrada.nextLine();
		
		System.out.print("Digite a quantidade de peças que você deseja: ");
		int quantPeca2 = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Digite o valor unitário dessa peça: ");
		double valor2 = Double.parseDouble(entrada.nextLine());
		
		
		//Exibindo e calculando os totais
		double total1 = quantPeca1 * valor1;
		System.out.println("\nO valor total dos gastos da peça " + peca1 + "é igual a: " + total1);

		double total2 = quantPeca2 * valor2;
		System.out.println("O valor total dos gastos da peça " + peca2 + "é igual a: " + total2);
		
		double valorTotal = total1 + total2;
		System.out.println("O valor total a ser pago é: " + valorTotal);
		
		entrada.close();
		
	}

}
