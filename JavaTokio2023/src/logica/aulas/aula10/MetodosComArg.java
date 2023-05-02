package logica.aulas.aula10;

import java.util.Scanner;

public class MetodosComArg {
	
	// METODOS SEM RETORNO COM ARGUMENTOS/PARAMETROS
	
	static void saudacaoComArgs(String nome, int idade){
		
		if (idade >= 18) {
			System.out.printf("Ola, %s! Voce tem %d anos e eh maior de idade!\n", nome, idade);
		} else {
			System.out.printf("Ola, %s! Voce tem %d anos e eh menor de idade!\n", nome, idade);
		}
	}
	
	static void somar(int numA, int numB) {
		System.out.println("Soma: " + (numA + numB));
	}
	
	public static void main(String[] args) {
		
		// SOMA 2 NUMEROS
		//somar(10, 2);
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o seu nome: ");
		String nomeDig = sc.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idadeDig = sc.nextInt();
		
		saudacaoComArgs(nomeDig, idadeDig);
		
		sc.close();
		
		
	}

}
