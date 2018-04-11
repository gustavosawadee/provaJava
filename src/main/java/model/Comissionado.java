package model;

public class Comissionado extends Empregado{
	private static Double totalVenda;
	private static Double taxaComissao;
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
}
