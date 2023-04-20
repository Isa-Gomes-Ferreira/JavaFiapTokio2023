package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite quantos quilômetros você percorreu: ");
		int kms = entrada.nextInt();
		
		System.out.print("Digite quantos litros de combustível foram gastos: ");
		int comb = entrada.nextInt();
		
		int consu = kms / comb;
		
		System.out.println("\nO seu carro consome " + comb + " litros por " + kms + " quilômetros.");
		System.out.println("O seu consumo médio é de: " + consu + "km/L");
		
		if (consu < 8) {
			System.out.println("Esse carro bebe hein!");
		} else {
			System.out.println("Autonomia legal");
		}

		entrada.close();

	}

}
