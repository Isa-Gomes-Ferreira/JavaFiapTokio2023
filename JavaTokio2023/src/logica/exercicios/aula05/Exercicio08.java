package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o valor em reais para a conversão: ");
		double valor = entrada.nextDouble();
		
		System.out.println("----------------------------------------");
		
		//convertendo e exibindo
		double dolar = valor * 0.20;
		System.out.printf("Dólar americano: %.2f \n", dolar);
		
		double euro = valor * 0.18;
		System.out.printf("Euro: %.2f \n", euro);
		
		double pesoA = valor * 42.78;
		System.out.printf("Peso argentino: %.2f \n", pesoA);
		
		double libraE = valor * 0.16;
		System.out.printf("Libra Esterlina: %.2f \n", libraE);
		
		double iene = valor * 26.49;
		System.out.printf("Iene: %.2f \n", iene);
		
		
		entrada.close();
		
	}

}
