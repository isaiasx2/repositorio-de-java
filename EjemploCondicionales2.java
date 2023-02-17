package primerosPasos;

public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Condicionales");

		int edad = 21;
		int cantidadDePersonas = 2;
		boolean esPareja = cantidadDePersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		System.out.println("El valor de la condicion es: " + esPareja);

		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");//Scope es todo lo que esta dentro de la llave

		} else {
			System.out.println("usted no puede entrar");
		}
	}
}
//Todo boolean por defecto es false