package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite a nota 1: ");
		double A = entrada.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		double B = entrada.nextDouble();
		
		double media = ((A * 4) + (B * 6)) / 10;
		System.out.println("A sua média é: " + media);

		entrada.close();

	}
}
