package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		for (int i = 2; i <= num; i++) {
			
			if (i % 2 == 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}

}
