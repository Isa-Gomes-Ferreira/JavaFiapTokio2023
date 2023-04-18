package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o seu salário: ");
		double salario = entrada.nextDouble();
		
		System.out.println("Seu salário: " + salario);

		entrada.close();
	}

}
