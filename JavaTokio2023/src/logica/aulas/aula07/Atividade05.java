package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		System.out.print("Digite a quantidade de produtos: ");
		int qntProdutos = tec.nextInt();

		for (int i = 0; i < qntProdutos; i++) {
			System.out.println("Produto " + (i + 1));
		}

		tec.close();

	}

}
