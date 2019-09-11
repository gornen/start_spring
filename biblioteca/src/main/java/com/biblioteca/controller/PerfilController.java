package com.biblioteca.controller;

import static com.biblioteca.generatedclasses.tables.Perfil.PERFIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biblioteca.model.Perfil;

@Controller
@RequestMapping("/perfil")
public class PerfilController {
	
	@RequestMapping(value = "/perfil", method = RequestMethod.GET)
	public ArrayList<Perfil> getUsuarios() {
		
		ArrayList<Perfil> todosPerfis = null;
		Connection conn = null;

		String userName = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/bibliotecaPO";

		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);

			//buscando dados no banco
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			Result<Record> result = create.select().from(PERFIL).fetch();
			
		
			
			//iterando os resultados
			for (Record r : result) {
				
				Perfil p = new Perfil();
				p.setId(r.getValue(PERFIL.ID));
				p.setNome(r.getValue(PERFIL.NOME));
				System.out.println(p.getId()+" : "+p.getNome());
				todosPerfis.add(p);
			}
			
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException ignore) {
					}
				}
			}


		return todosPerfis;
		
	}
}
