package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a média da turma: ");
		double med = sc.nextDouble();
		int qntNotas = 0;

		for (int i = 0; i < 20; i++) {

			System.out.print("Digite a nota " + (i + 1) + ":");
			double notas = sc.nextDouble();

			if (notas > med) {
				qntNotas++;
			}
		}

		System.out.println("Ha " + qntNotas + " notas acima da média nesta turma!");

		sc.close();

	}

}
