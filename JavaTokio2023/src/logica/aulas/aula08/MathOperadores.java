package logica.aulas.aula08;

public class MathOperadores {

	public static void main(String[] args) {
		
		double PI = Math.PI;
		System.out.println(PI);
		
		System.out.println(Math.sqrt(225));
		
		System.out.println(Math.abs(-25));
		
		double num = 3.5;
		
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		System.out.println(Math.round(num));
		
		// ------------------------------ //
		// Método Random de forma manual //
		// ---------------------------- //
		
		System.out.println("");
		double random = Math.random();
		System.out.println(random);
		
		double min = 5;
		double max = 10;
		
		double preparandoIntervalo = random * (max - min);
		System.out.println("Preparando intervalo: " + preparandoIntervalo);
		
		double intervalo = min + random * (max - min);
		System.out.println("Intervalo: " + intervalo);
		
		/*
		double multiplica = random * 5;
		System.out.println(multiplica);
		
		System.out.println(Math.ceil(multiplica));
		*/
		
		
	}

}
