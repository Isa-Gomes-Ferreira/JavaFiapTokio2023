package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número 1: ");
		int num1 = entrada.nextInt();

		System.out.println("Digite o número 2: ");
		int num2 = entrada.nextInt();

		if (num1 > num2) {
			System.out.println("O primeiro número digitado é maior!");
		} else if (num1 < num2) {
			System.out.println("O segundo número digitado é maior!");
		} else {
			System.out.println("Os números digitados são iguais!");
		}

		entrada.close();

	}

}
