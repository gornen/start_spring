/**
 * This class is generated by jOOQ
 */
package com.biblioteca.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StatusEmprestimoRecord extends org.jooq.impl.UpdatableRecordImpl<com.biblioteca.generatedclasses.tables.records.StatusEmprestimoRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -1010677396;

	/**
	 * Setter for <code>bibliotecaPO.Status_Emprestimo.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>bibliotecaPO.Status_Emprestimo.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>bibliotecaPO.Status_Emprestimo.nome</code>. 
	 */
	public void setNome(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>bibliotecaPO.Status_Emprestimo.nome</code>. 
	 */
	public java.lang.String getNome() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.biblioteca.generatedclasses.tables.StatusEmprestimo.STATUS_EMPRESTIMO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.biblioteca.generatedclasses.tables.StatusEmprestimo.STATUS_EMPRESTIMO.NOME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getNome();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StatusEmprestimoRecord
	 */
	public StatusEmprestimoRecord() {
		super(com.biblioteca.generatedclasses.tables.StatusEmprestimo.STATUS_EMPRESTIMO);
	}

	/**
	 * Create a detached, initialised StatusEmprestimoRecord
	 */
	public StatusEmprestimoRecord(java.lang.Integer id, java.lang.String nome) {
		super(com.biblioteca.generatedclasses.tables.StatusEmprestimo.STATUS_EMPRESTIMO);

		setValue(0, id);
		setValue(1, nome);
	}
}
