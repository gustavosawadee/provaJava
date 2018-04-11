package model;

public class Empregado {
	
	private static int id;
	private static String nome;
	private static String sobrenome;
	private static String cpf;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Empregado.id = id;
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Empregado.nome = nome;
	}

	public static String getSobrenome() {
		return sobrenome;
	}

	public static void setSobrenome(String sobrenome) {
		Empregado.sobrenome = sobrenome;
	}

	public static String getCpf() {
		return cpf;
	}

	public static void setCpf(String cpf) {
		Empregado.cpf = cpf;
	}

	public Double vencimento() {
		Double a = 3.3;
		return a;
	}
}
