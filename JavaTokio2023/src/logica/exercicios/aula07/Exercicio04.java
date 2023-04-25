package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int soma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			
			soma = soma + num;
		}
		
		System.out.println("A soma dos números digitados é: " + soma);
		
		sc.close();
	}

}
