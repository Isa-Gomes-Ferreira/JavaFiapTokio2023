package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a nota 1: ");
		double nota1 = entrada.nextDouble();

		System.out.println("Digite a nota 2: ");
		double nota2 = entrada.nextDouble();

		System.out.println("Digite a nota 3: ");
		double nota3 = entrada.nextDouble();

		System.out.println("Digite a nota 4: ");
		double nota4 = entrada.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7.00) {
			System.out.println("Aprovado");
		} else if ((media >= 5) && (media < 7)) {
			System.out.println("Em recuperação");
		} else {
			System.out.println("Reprovado");
		}

		entrada.close();

	}

}
