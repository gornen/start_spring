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
public class MultaRecord extends org.jooq.impl.UpdatableRecordImpl<com.biblioteca.generatedclasses.tables.records.MultaRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Byte, java.lang.Double, java.lang.Integer> {

	private static final long serialVersionUID = -1490481403;

	/**
	 * Setter for <code>bibliotecaPO.Multa.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>bibliotecaPO.Multa.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>bibliotecaPO.Multa.status_multa</code>. 
	 */
	public void setStatusMulta(java.lang.Byte value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>bibliotecaPO.Multa.status_multa</code>. 
	 */
	public java.lang.Byte getStatusMulta() {
		return (java.lang.Byte) getValue(1);
	}

	/**
	 * Setter for <code>bibliotecaPO.Multa.valor</code>. 
	 */
	public void setValor(java.lang.Double value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>bibliotecaPO.Multa.valor</code>. 
	 */
	public java.lang.Double getValor() {
		return (java.lang.Double) getValue(2);
	}

	/**
	 * Setter for <code>bibliotecaPO.Multa.fk_emprestimo</code>. 
	 */
	public void setFkEmprestimo(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>bibliotecaPO.Multa.fk_emprestimo</code>. 
	 */
	public java.lang.Integer getFkEmprestimo() {
		return (java.lang.Integer) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Byte, java.lang.Double, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Byte, java.lang.Double, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.biblioteca.generatedclasses.tables.Multa.MULTA.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field2() {
		return com.biblioteca.generatedclasses.tables.Multa.MULTA.STATUS_MULTA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field3() {
		return com.biblioteca.generatedclasses.tables.Multa.MULTA.VALOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return com.biblioteca.generatedclasses.tables.Multa.MULTA.FK_EMPRESTIMO;
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
	public java.lang.Byte value2() {
		return getStatusMulta();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value3() {
		return getValor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getFkEmprestimo();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MultaRecord
	 */
	public MultaRecord() {
		super(com.biblioteca.generatedclasses.tables.Multa.MULTA);
	}

	/**
	 * Create a detached, initialised MultaRecord
	 */
	public MultaRecord(java.lang.Integer id, java.lang.Byte statusMulta, java.lang.Double valor, java.lang.Integer fkEmprestimo) {
		super(com.biblioteca.generatedclasses.tables.Multa.MULTA);

		setValue(0, id);
		setValue(1, statusMulta);
		setValue(2, valor);
		setValue(3, fkEmprestimo);
	}
}
