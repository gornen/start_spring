/**
 * This class is generated by jOOQ
 */
package com.biblioteca.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LivroAutor extends org.jooq.impl.TableImpl<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord> {

	private static final long serialVersionUID = -1994728971;

	/**
	 * The singleton instance of <code>bibliotecaPO.Livro_Autor</code>
	 */
	public static final com.biblioteca.generatedclasses.tables.LivroAutor LIVRO_AUTOR = new com.biblioteca.generatedclasses.tables.LivroAutor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord> getRecordType() {
		return com.biblioteca.generatedclasses.tables.records.LivroAutorRecord.class;
	}

	/**
	 * The column <code>bibliotecaPO.Livro_Autor.id</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>bibliotecaPO.Livro_Autor.fk_livro</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord, java.lang.Integer> FK_LIVRO = createField("fk_livro", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>bibliotecaPO.Livro_Autor.fk_autor</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord, java.lang.Integer> FK_AUTOR = createField("fk_autor", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * Create a <code>bibliotecaPO.Livro_Autor</code> table reference
	 */
	public LivroAutor() {
		super("Livro_Autor", com.biblioteca.generatedclasses.Bibliotecapo.BIBLIOTECAPO);
	}

	/**
	 * Create an aliased <code>bibliotecaPO.Livro_Autor</code> table reference
	 */
	public LivroAutor(java.lang.String alias) {
		super(alias, com.biblioteca.generatedclasses.Bibliotecapo.BIBLIOTECAPO, com.biblioteca.generatedclasses.tables.LivroAutor.LIVRO_AUTOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord, java.lang.Integer> getIdentity() {
		return com.biblioteca.generatedclasses.Keys.IDENTITY_LIVRO_AUTOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord> getPrimaryKey() {
		return com.biblioteca.generatedclasses.Keys.KEY_LIVRO_AUTOR_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord>>asList(com.biblioteca.generatedclasses.Keys.KEY_LIVRO_AUTOR_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord, ?>>asList(com.biblioteca.generatedclasses.Keys.FK_LIVRO_AUTOR_2, com.biblioteca.generatedclasses.Keys.FK_LIVRO_AUTOR_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.biblioteca.generatedclasses.tables.LivroAutor as(java.lang.String alias) {
		return new com.biblioteca.generatedclasses.tables.LivroAutor(alias);
	}
}
