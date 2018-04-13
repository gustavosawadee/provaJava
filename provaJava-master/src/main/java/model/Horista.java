package model;

public class Horista{
	private static int id;
	private static Double precoHora;
	private static Double horasTrabalhadas;
	private static int fk;
	
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
	public static int getFk() {
		return fk;
	}
	public static void setFk(int fk) {
		Horista.fk = fk;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Horista.id = id;
	}
}
