/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "t_725_lob_test", schema = "test2")
public class T_725LobTest implements java.io.Serializable {

	private static final long serialVersionUID = 1184571190;

	private java.lang.Integer id;
	private byte[]            lob;

	public T_725LobTest() {}

	public T_725LobTest(
		java.lang.Integer id,
		byte[]            lob
	) {
		this.id = id;
		this.lob = lob;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "LOB")
	public byte[] getLob() {
		return this.lob;
	}

	public void setLob(byte[] lob) {
		this.lob = lob;
	}
}
