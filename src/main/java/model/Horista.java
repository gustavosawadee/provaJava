package model;

public class Horista extends Empregado{
	private static Double precoHora;
	private static Double horasTrabalhadas;
	public static Double getPrecoHora() {
		return precoHora;
	}
	public static void setPrecoHora(Double precoHora) {
		Horista.precoHora = precoHora;
	}
	public static Double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public static void setHorasTrabalhadas(Double horasTrabalhadas) {
		Horista.horasTrabalhadas = horasTrabalhadas;
	}
}
