package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu salário: ");
		double sal = entrada.nextDouble();
		
		System.out.println("---------------------");
		
		System.out.println("O seu salário é: " + sal);
		
		double reaj;
		
		// reajuste
		if (sal <= 280.00) {
			reaj = sal * 0.20;
			sal = sal + reaj;
		} else if ((sal > 280.00) && (sal < 700.00)) {
			reaj = sal * 0.15;
			sal = sal + reaj;
		} else if ((sal > 700.00) && (sal < 1500.00)) {
			reaj = sal * 0.10;
			sal = sal + reaj;
		} else if (sal > 1500.00) {
			reaj = sal * 0.05;
			sal = sal + reaj;
		}

		entrada.close();

	}

}
