package model;

public class Comissionado{
	private static int id;
	private static Double totalVenda;
	private static Double taxaComissao;
	private static int fk;
	public static Double getTotalVenda() {
		return totalVenda;
	}
	public static void setTotalVenda(Double totalVenda) {
		Comissionado.totalVenda = totalVenda;
	}
	public static Double getTaxaComissao() {
		return taxaComissao;
	}
	public static void setTaxaComissao(Double taxaComissao) {
		Comissionado.taxaComissao = taxaComissao;
	}
	public static int getFk() {
		return fk;
	}
	public static void setFk(int fk) {
		Comissionado.fk = fk;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Comissionado.id = id;
	}
}
