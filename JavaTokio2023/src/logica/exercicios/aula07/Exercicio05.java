package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, num2 = 0;

		for (int i = 0; i < 12; i++) {

			System.out.print("Digite um número: ");
			num = sc.nextInt();

			if (num > num2) {
				num2 = num;
			}

		}

		System.out.println("O maior número digitado é: " + num2);

		sc.close();
	}

}
