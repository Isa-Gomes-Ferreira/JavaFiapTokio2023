package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano do seu nascimento: ");
		int ano = entrada.nextInt();

		if (2023 - ano <= 15) {
			System.out.println("O voto é proibido este ano.");
		} else if ((2023 - ano >= 16) && (2023 - ano < 18)) {
			System.out.println("O voto é opcional este ano.");
		} else if (2023 - ano > 70) {
			System.out.println("O voto é opcional este ano.");
		} else {
			System.out.println("O voto é obrigatório este ano.");
		}

		entrada.close();

	}

}
