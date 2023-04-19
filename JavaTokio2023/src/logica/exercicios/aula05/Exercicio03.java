package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o seu nome completo: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite um dos seguintes valores para declarar o seu gênero: ");
		System.out.println("-----------------------------------------------------------");
		System.out.println("[ M ] para masculino;\r\n"
							+ "[ F ] para feminino;\r\n"
							+ "[ O ] outro;\r\n"
							+ "[ N ] não responder;");
	
		char genero = entrada.nextLine().charAt(0);
		
		System.out.println("Olá, " + nome + "! Você escolheu a seguinte opção de gênero: " + genero);
		
		entrada.close();

	}

}
