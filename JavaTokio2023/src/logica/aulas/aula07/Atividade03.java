package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número n: ");

		int n = entrada.nextInt();

		int i = 1;

		while (i <= n) {
			System.out.println(i);
			i++;
		}

		entrada.close();

	}

}
