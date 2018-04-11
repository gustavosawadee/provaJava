package view;

import java.sql.Connection;
import java.sql.SQLException;

import model.Assalariado;
import persistence.AssalariadoDao;

public class App {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Connection conn = persistence.JdbcUtil.getConnection();
		AssalariadoDao a = new AssalariadoDao(conn);
		Assalariado b = new Assalariado();
		b.setNome("wesley");
		b.setSobrenome("vieira");
		b.setSalario(123123.13123);
		b.setCpf("123123213");
		a.Salvar(b);
	}
}
