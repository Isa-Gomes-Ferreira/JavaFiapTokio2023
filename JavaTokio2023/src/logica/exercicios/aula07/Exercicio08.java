package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int soma = 0;
		int qntNum = 0; 
				
			do {
				System.out.print("Digite quantos números você deseja fazer o cálculo: ");
				qntNum = sc.nextInt();
				
			} while (qntNum < 0);
				
				for (int i = 0; i < qntNum; i++) {
					System.out.print("Digite um número: ");
					
					int num = sc.nextInt();
					
					soma = soma + num;
				}
				
		 
		System.out.println("O a soma dos números digitados é: " + soma);
		
		sc.close();
	}

}
