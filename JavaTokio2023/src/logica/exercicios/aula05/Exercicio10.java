package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int anos = entrada.nextInt();
		int meses = entrada.nextInt();
		int dias = entrada.nextInt();
		
		int qntdDias = (anos * 365) + (meses * 30) + (dias);
		
		System.out.println("Quantidade de dias vividos: " + qntdDias);
		
		entrada.close();
	}

}
