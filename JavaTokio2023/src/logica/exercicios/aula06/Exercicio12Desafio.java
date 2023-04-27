package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio12Desafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		int ladoA = entrada.nextInt();
		int ladoB = entrada.nextInt();
		int ladoC = entrada.nextInt();
		
		System.out.printf("Lado A: %d \nLado B: %d \nLado C: %d\n\n", ladoA, ladoB, ladoC);
		
		
		int X = 0;
		
		if (ladoA < ladoB){
			X = ladoA;
			ladoA = ladoB;
			ladoB = X;
			System.out.printf("Lado A: %d \nLado B: %d \nLado C: %d\n\n", ladoA, ladoB, ladoC);
		}
		
		
		if (ladoB < ladoC) {
			X = ladoB;
			ladoB = ladoC;
			ladoC = X;
			System.out.printf("Lado A: %d \nLado B: %d \nLado C: %d\n\n", ladoA, ladoB, ladoC);
		}
		
	
		if (ladoA < ladoB){
			X = ladoA;
			ladoA = ladoB;
			ladoB = X;
			System.out.printf("Lado A: %d \nLado B: %d \nLado C: %d\n\n", ladoA, ladoB, ladoC);
		}
		
		
		if (ladoA >= (ladoB + ladoC)) {
			System.out.println("NÃO FORMA TRIÂNGULO");
		} else {
			if((ladoA * ladoA) == (ladoB * ladoB) + (ladoC * ladoC)) {
				System.out.println("TRIÂNGULO RETÂNGULO");
			} else if ((ladoA * ladoA) > (ladoB * ladoB) + (ladoC * ladoC)) {
				System.out.println("TRIÂNGULO OBTUSÂNGULO");
			} else {
				System.out.println("TRIÂNGULO ACUTÂNGULO");
			}
			
			if (ladoA == ladoB && ladoB == ladoC) {
				System.out.println("TRIÂNGULO EQUILÁTERO");
			}
			
			if ((ladoA == ladoB && ladoC != ladoA) || (ladoB == ladoC && ladoA != ladoB)) {
				System.out.println("TRIÂNGULO ISÓSCELES");
			}
		}
		
		entrada.close();
	}

}
