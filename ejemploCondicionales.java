package primerosPasos;

public class ejemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Condicionales");

		int edad = 12;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");

		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad pero puede pasar acompaniado");
			} else {
				System.out.println("Usted no tiene permitido entrar");
			}

		}
	}
}
