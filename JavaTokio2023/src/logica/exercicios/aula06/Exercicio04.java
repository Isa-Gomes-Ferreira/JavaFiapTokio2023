package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o número 1: ");
		double num1 = entrada.nextDouble();

		System.out.print("Digite o número 2: ");
		double num2 = entrada.nextDouble();

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São múltiplos!");
		} else {
			System.out.println("Não são múltiplos");
		}
		
		entrada.close();

	}

}
