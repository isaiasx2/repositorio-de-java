package primerosPasos;

public class TestIR {
	public static void main(String[] args) {
		double salario = 3300.0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("El IR es de 7.5%");
			System.out.println("Puede deducir 142");
		}else if(salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("El IR es de 15%");
			System.out.println("Puede deducir 350");
		}else if(salario >= 3751.01 && salario <=4664.00){
			System.out.println("El IR es de 22.5%");
			System.out.println("Puede deducir 636");
		}
	}
}
