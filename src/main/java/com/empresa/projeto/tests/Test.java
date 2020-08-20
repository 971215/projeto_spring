package com.empresa.projeto.tests;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.empresa.projeto.connection.ConnectionJDBCMySql;
import com.empresa.projeto.entities.Category;

public class Test {
		
		
		
		
					
	public static void main(String[] args) {
		Connection conn= null;		
		PreparedStatement pstm = null;
		ResultSet rs = null;
		conn = ConnectionJDBCMySql.conector();
		Category cat = new Category();
		
		String sql = "SELECT id, name FROM category";
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
			cat.setId(rs.getLong("id"));
			cat.setName(rs.getString("name"));
			
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
