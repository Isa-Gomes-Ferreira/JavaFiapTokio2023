package logica.aulas.aula05;

import java.util.Scanner;

public class Tipos {

	public static void main(String[] args) {

		float preco = 10.99f;
		float preco2 = (float) 12.90;

		System.out.println("Float 1: " + preco);
		System.out.println("Float 2: " + preco2);

		int precoInteiro = (int) 2.50;
		System.out.println("Valor interio: " + precoInteiro);

		int numeroX = 6;
		double numeroXDouble = numeroX;
		System.out.println(" ");
		System.out.println(numeroX);
		System.out.println(numeroXDouble);

		Scanner entrada = new Scanner(System.in);

		System.out.println(" ");
		System.out.print("Digite um número: ");
		int numeroIn = (int) entrada.nextDouble();

		System.out.println(numeroIn);

		entrada.close();
	}

}
