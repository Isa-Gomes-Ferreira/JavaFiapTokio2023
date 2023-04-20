package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Valor do KW/h por tipo:");
		System.out.println("-------------------------");
		System.out.println("[ 0.60 ] para residência;\r\n" + "[ 0.48 ] para comércio;\r\n" + "[ 1.29 ] indústria;");
		System.out.println("-------------------------");

		System.out.print("\nDigite o valor do KW/h: ");
		double valorKw = entrada.nextDouble();

		if ((valorKw == 0.60) || (valorKw == 0.48) || (valorKw == 1.29)) {
			System.out.println("Digite a quantia de KW/h consumidos: ");
			int qntd = entrada.nextInt();

			double total = valorKw * qntd;
			System.out.println("O valor total da sua conta é de R$" + total);

		} else {
			System.out.println("Valor invalido.");
		}

		entrada.close();

	}

}
