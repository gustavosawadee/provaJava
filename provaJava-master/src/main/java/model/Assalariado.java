package model;

public class Assalariado{
	private static int id;
	private static Double salario;
	private static int fk;

	public static Double getSalario() {
		return salario;
	}

	public static void setSalario(Double salario) {
		Assalariado.salario = salario;
	}

	public static int getFk() {
		return fk;
	}

	public static void setFk(int fk) {
		Assalariado.fk = fk;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Assalariado.id = id;
	}

	
}
