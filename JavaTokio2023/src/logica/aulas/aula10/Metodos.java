package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	
	// METODOS SEM RETORNO E SEM ARGUMENTOS/PARAMETROS
	
	static void saudacao() {
		System.out.println("Bem vindo ao programa");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();
		
		System.out.printf("Ola, %s! Voce tem %d anos\n\n", nome, idade);
		
		if(idade >= 18) {
			System.out.printf("Ola %s! Voce tem %d anos e eh maior de idade!", nome, idade);
		} else {
			System.out.printf("Ola %s! Voce tem %d anos e eh menor de idade!", nome, idade);
		}
	
		sc.close();
	}
	
	
	public static void main(String[] args) {
		
		saudacao();
		
	}

}
