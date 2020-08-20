package com.empresa.projeto.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionJDBCMySql {

	public static Connection conector() {

		// criando uma variável especial para
		// estabelecer uma conexão com o banco
		java.sql.Connection conexao = null;
		// carregando o driver correspondente
		// ao banco (não esqueça de importar ele
		// em libraries
		String driver = "com.mysql.cj.jdbc.Driver";
		// armazenando informações referente ao
		// banco de dados
		String url = "jdbc:mysql://localhost:3306/db_introducao_spring";
		String user = "root";
		String password = "";
		// estabelecendo a conexão com o banco
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(url, user, password);
			System.out.println("tudo ok");
			return conexao;

		} catch (Exception e) {
			// a linha abaixo serve de apoio para esclarecer o erro
			 System.out.println("erro -> "+e);
			return null;
		}

	}
	
		
		
		
	}


