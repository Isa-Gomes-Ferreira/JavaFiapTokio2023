package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

		System.out.print("Digite o preço do produto: ");
		double preco = entrada.nextDouble();
				
		System.out.print("\nDigite o valor pago: ");
		double valorPago = entrada.nextDouble();
		
		double troco = valorPago - preco;
		System.out.println("\nO troco do produto é: " + troco);

		entrada.close();
		
	}

}
