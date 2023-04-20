package logica.exercicios.aula06;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		int c = 4;
		int d = 8;
		
		if ((a <= b) && (b < d) == true) {
			System.out.println("A expressão '(a <= b) e (b < d)' é verdadeira!");
		} else {
			System.out.println("A expressão '(a <= b) e (b < d)' é falsa!");
		}

		
		if ((a == b) || (c != b) == true) {
			System.out.println("A expressão '(a = b) ou (c != b)' é verdadeira!");
		} else {
			System.out.println("A expressão '(a = b) ou (c != b)' é falsa!");
		}
		
		
		if ((d > a) && (c >= b) == true) {
			System.out.println("A expressão '(d > a) e (c >= b)' é verdadeira!");
		} else {
			System.out.println("A expressão '(d > a) e (c >= b)' é falsa!");
		}
		
		
		if ((a <= b) || (c <= d) == true) {
			System.out.println("A expressão '(a <= b) ou (c <= d)' é verdadeira!");
		} else {
			System.out.println("A expressão '(a <= b) ou (c <= d)' é falsa!");
		}
		
		
		if (((b > c) || (c < a)) && (d <= b) == true) {
			System.out.println("A expressão '(a <= b) ou (c <= d)' é verdadeira!");
		} else {
			System.out.println("A expressão '(a <= b) ou (c <= d)' é falsa!");
		}
		
	}

}
