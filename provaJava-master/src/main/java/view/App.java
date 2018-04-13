	package view;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import model.*;
import persistence.*;

public class App {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Connection conn = persistence.JdbcUtil.getConnection();
		EmpregadoDao empregadoDao = new EmpregadoDao(conn);
		AssalariadoDao assalariadoDao = new AssalariadoDao(conn);
		ComissionadoDao comissionadoDao = new ComissionadoDao(conn);
		HoristaDao horistaDao = new HoristaDao(conn);
		Horista horista = new Horista();
		Empregado empregado = new Empregado();
		Assalariado assalariado = new Assalariado();
		Comissionado comissionado = new Comissionado();
		
		horista.setPrecoHora(8.0);
		horista.setHorasTrabalhadas(3.0);
		horistaDao.Salvar(horista);
		comissionado.setTaxaComissao(100.0);
		comissionado.setTotalVenda(500.0);
		comissionadoDao.Salvar(comissionado);
		conn.close();
		
	}
}
