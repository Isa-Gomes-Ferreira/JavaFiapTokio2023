package logica.exercicios.aula08;

import java.util.Calendar;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		int dia = c.get(Calendar.DAY_OF_WEEK);
		
		if (dia == 3) {
			System.out.println("Hoje tem feira!");
		} else {
			System.out.println("Hoje não tem feira");
		}

	}

}
