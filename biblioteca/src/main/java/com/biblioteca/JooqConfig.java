package com.biblioteca;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.Configuration;
import org.jooq.util.jaxb.Database;
import org.jooq.util.jaxb.Generator;
import org.jooq.util.jaxb.Jdbc;
import org.jooq.util.jaxb.Target;

public class JooqConfig {

	public static void main(String[] args) throws Exception {
		Configuration configuration = new Configuration()
		    .withJdbc(new Jdbc()
		        .withDriver("com.mysql.jdbc.Driver")
		        .withUrl("jdbc:mysql://localhost:3306/bibliotecaPO")
		        .withUser("root")
		        .withPassword(""))
		    .withGenerator(new Generator()
		        .withName("org.jooq.util.DefaultGenerator")
		        .withDatabase(new Database()
		            .withName("org.jooq.util.mysql.MySQLDatabase")
		            .withIncludes(".*")
		            .withExcludes("")
		            .withInputSchema("bibliotecaPO"))
		        .withTarget(new Target()
		            .withPackageName("com.biblioteca.generatedclasses")
		            .withDirectory("/home/roberto/eclipse-workspace/biblioteca/src/main/java")));

		GenerationTool.main(configuration);
	}

}