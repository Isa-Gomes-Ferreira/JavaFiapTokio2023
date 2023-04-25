package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int resp;

		do {
			System.out.println("Olá, Mundo!");

			System.out.println("---------------------------------------");
			System.out.println("Você deseja exibir a mensagem novamente?");
			System.out.println("[ 1 ] sim; \r\n" + "[ 2 ] não.");
			System.out.println("---------------------------------------");
			System.out.print("Digite 1 para exibir novamente e 2 para não exibir novamente: ");
			resp = sc.nextInt();

		} while (resp == 1);

		sc.close();
	}

}
