package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		int tab = 0;
		
		for (int i = 0; i <= 25; i ++) {
			tab = (num * i);
			System.out.println(num + " x " + i + " = " + tab);
		}
		
		sc.close();
	}

}
