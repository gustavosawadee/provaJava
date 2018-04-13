package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Assalariado;
import model.Comissionado;
import model.Horista;

public class HoristaDao {
	private Connection conn;

	public HoristaDao(Connection conn) {
		this.conn = conn;
	}

	public void Salvar(Horista c) throws SQLException {
		String sql = "insert into horista (precoHora,horasTrabalhadas, fk_empregado) values ('" + c.getPrecoHora() + "','"+ c.getHorasTrabalhadas() + "','"+c.getFk()+"')";
		System.out.println(sql);
		PreparedStatement comando = this.conn.prepareStatement(sql);
		comando.executeUpdate();
		comando.close();
	}

	public void Apagar(Horista c) throws SQLException {
		String sql = "delete from horista where id_horista = " + c.getId();
		PreparedStatement comando = this.conn.prepareStatement(sql);
		comando.executeUpdate();
		comando.close();
	}

	public void Alterar(Horista c) throws SQLException {
		String sql = "update from horista set precoHora = '"  + "'precoHora = '" + c.getPrecoHora() + "'horasTrabalhadas'" + c.getHorasTrabalhadas() +  "' where id_horista = "+c.getId();
		PreparedStatement comando = this.conn.prepareStatement(sql);
		comando.executeUpdate();
		comando.close();		
	}
	
	public ArrayList<Horista> Listar() throws SQLException{
		ArrayList<Horista> horista = new ArrayList<Horista>();
		PreparedStatement comando = this.conn.prepareStatement("select * from horista");
		ResultSet data = comando.executeQuery();
		while(data.next()) {
			Horista a = new Horista();
			a.setId(data.getInt("id_horista"));
			horista.add(a);			
		}		
		return horista;
	}
}

