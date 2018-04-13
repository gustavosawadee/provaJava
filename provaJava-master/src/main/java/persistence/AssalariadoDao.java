package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Assalariado;

public class AssalariadoDao {
	private Connection conn;

	public AssalariadoDao(Connection conn) {
		this.conn = conn;
	}

	public void Salvar(Assalariado c) throws SQLException {
		String sql = "insert into assalariado (salario, fk_empregado) values ('" + c.getSalario() + "','"+c.getFk()+"')";
		PreparedStatement comando = this.conn.prepareStatement(sql);
		comando.executeUpdate();
		comando.close();
	}

	public void Apagar(Assalariado c) throws SQLException {
		String sql = "delete from assalariado where id_assalariado = " + c.getId();
		PreparedStatement comando = this.conn.prepareStatement(sql);
		comando.executeUpdate();
		comando.close();
	}

	public void Alterar(Assalariado c) throws SQLException {
		String sql = "update from assalariado set salario = '"  + "'salario = '" + c.getSalario() + "' where id_assalariado = "+c.getId();
		PreparedStatement comando = this.conn.prepareStatement(sql);
		comando.executeUpdate();
		comando.close();		
	}
	
	public ArrayList<Assalariado> Listar() throws SQLException{
		ArrayList<Assalariado> assalariado = new ArrayList<Assalariado>();
		PreparedStatement comando = this.conn.prepareStatement("select * from assalariado");
		ResultSet data = comando.executeQuery();
		while(data.next()) {
			Assalariado a = new Assalariado();
			a.setId(data.getInt("id_assalariado"));
			assalariado.add(a);			
		}		
		return assalariado;
	}
}
