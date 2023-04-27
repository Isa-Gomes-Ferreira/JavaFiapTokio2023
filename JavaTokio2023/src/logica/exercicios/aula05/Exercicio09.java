package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um número entre 0 e 999: ");
		int num = entrada.nextInt();
		
		System.out.println("Valor digitado: " + num);
		System.out.println("");
		
		int centena = (num / 100) * 100;
		System.out.println("Centena = " + centena);
		
		int restoDez = num - centena;
		int dezena = (restoDez / 10) * 10;
		System.out.println("Dezena = " + dezena);
		
		int unidade = restoDez - dezena;
		System.out.println("Unidade = " + unidade);
		
		entrada.close();
		
	}

}
