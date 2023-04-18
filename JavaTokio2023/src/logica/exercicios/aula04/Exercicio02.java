package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu nome:");
		String nome = entrada.nextLine();

		System.out.println("O seu nome é" + nome);

		entrada.close();
	}

}
