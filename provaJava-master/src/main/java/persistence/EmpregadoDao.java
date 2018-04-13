package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Empregado;

public class EmpregadoDao {

	private Connection conn;

	public EmpregadoDao(Connection conn) {
		this.conn = conn;
	}

	public void Salvar(Empregado c) throws SQLException {
		String sql = "insert into empregado (nome,sobrenome,cpf) values ('" + c.getNome() + "','"+c.getSobrenome()+ "', '" + c.getCpf() + "')";
		PreparedStatement comando = this.conn.prepareStatement(sql);
		comando.executeUpdate();
		comando.close();
	}

	public void Apagar(Empregado c) throws SQLException {
		String sql = "delete from empregado where id_empregado = " + c.getId();
		PreparedStatement comando = this.conn.prepareStatement(sql);
		comando.executeUpdate();
		comando.close();
	}

	public void Alterar(Empregado c) throws SQLException {
		String sql = "update from empregado set nome = '"+c.getNome()  + "', sobrenome = '"+c.getSobrenome()+"', cpf = '" + c.getCpf();
		PreparedStatement comando = this.conn.prepareStatement(sql);
		comando.executeUpdate();
		comando.close();		
	}
	
	public ArrayList<Empregado> Listar() throws SQLException{
		ArrayList<Empregado> ListAssalariados = new ArrayList<Empregado>();
		PreparedStatement comando = this.conn.prepareStatement("select * from empregado");
		ResultSet data = comando.executeQuery();
		while(data.next()) {
			Empregado a = new Empregado();
			a.setId(data.getInt("id_empregado"));
			a.setNome(data.getString("nome"));
			a.setSobrenome(data.getString("sobrenome"));
			a.setCpf(data.getString("cpf"));
			System.out.println(a.getNome()+" "+a.getSobrenome());
			ListAssalariados.add(a);			
		}		
		return ListAssalariados;
	}
}
