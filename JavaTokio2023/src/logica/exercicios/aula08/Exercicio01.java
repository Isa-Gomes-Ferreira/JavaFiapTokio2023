package logica.exercicios.aula08;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine(); 
		
		Calendar c = Calendar.getInstance();
		int hora = c.get(Calendar.HOUR_OF_DAY);
		
		if((hora >= 6) && (hora < 12) ) {
			System.out.println("Bom dia, " + nome + "!");
		} else if ((hora >= 12) && (hora < 18)) {
			System.out.println("Boa tarde, " + nome + "!");
		} else {
			System.out.println("Boa noite, " + nome + "!");
		}

		sc.close();
	}

}
