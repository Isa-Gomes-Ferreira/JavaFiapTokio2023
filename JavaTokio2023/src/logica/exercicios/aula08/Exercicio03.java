package logica.exercicios.aula08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o seu texto: ");
		String texto = sc.nextLine();
		
		int mai = 0;
		int min = 0;
		int num = 0;
		int esp = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			
			if ((texto.charAt(i) >= 'A') && (texto.charAt(i) <= 'Z')) {
				mai = mai + 1; 
			}
			
			if ((texto.charAt(i) >= 'a') && (texto.charAt(i) <= 'z')) {
				min = min + 1; 
			}
			
			if ((texto.charAt(i) >= '0') && (texto.charAt(i) <= '9')) {
				num = num + 1; 
			}
			
			if ((texto.charAt(i) >= ' ') && (texto.charAt(i) <= ' ')) {
				esp = esp + 1; 
			}
			
		}
		
		System.out.println(mai);
		System.out.println(min);
		System.out.println(num);
		System.out.println(esp);
		
		sc.close();
	}

}
