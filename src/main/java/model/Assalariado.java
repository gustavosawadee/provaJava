package model;

public class Assalariado extends Empregado{
	private static Double salario;

	public static Double getSalario() {
		return salario;
	}

	public static void setSalario(Double salario) {
		Assalariado.salario = salario;
	}
}
