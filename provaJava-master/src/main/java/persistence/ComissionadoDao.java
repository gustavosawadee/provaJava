package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Assalariado;
import model.Comissionado;

public class ComissionadoDao {
	private Connection conn;

	public ComissionadoDao(Connection conn) {
		this.conn = conn;
	}

	public void Salvar(Comissionado c) throws SQLException {
		String sql = "insert into comissionado (totalVenda,taxaComissao, fk_empregado) values ('" + c.getTotalVenda() + "','"+ c.getTaxaComissao()+ "','"+c.getFk()+"')";
		PreparedStatement comando = this.conn.prepareStatement(sql);
		comando.executeUpdate();
		comando.close();
	}

	public void Apagar(Comissionado c) throws SQLException {
		String sql = "delete from comissionado where id_comissionado = " + c.getId();
		PreparedStatement comando = this.conn.prepareStatement(sql);
		comando.executeUpdate();
		comando.close();
	}

	public void Alterar(Comissionado c) throws SQLException {
		String sql = "update from comissionado set totalVenda = '"  + "'TotalVenda = '" + c.getTotalVenda() + "'tavaComissao'" + c.getTaxaComissao()+  "' where id_comissionado = "+c.getId();
		PreparedStatement comando = this.conn.prepareStatement(sql);
		comando.executeUpdate();
		comando.close();		
	}
	
	public ArrayList<Comissionado> Listar() throws SQLException{
		ArrayList<Comissionado> comissionado = new ArrayList<Comissionado>();
		PreparedStatement comando = this.conn.prepareStatement("select * from comissionado");
		ResultSet data = comando.executeQuery();
		while(data.next()) {
			Comissionado a = new Comissionado();
			a.setId(data.getInt("id_comissionado"));
			comissionado.add(a);			
		}		
		return comissionado;
	}
}

