/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
public class U_ADDRESS_TABLE extends org.jooq.impl.ArrayRecordImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> {

	private static final long serialVersionUID = 1823960995;

	public U_ADDRESS_TABLE(org.jooq.Configuration configuration) {
		super("TEST.U_ADDRESS_TABLE", org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.U_ADDRESS_TYPE.getDataType(), configuration);
	}

	public U_ADDRESS_TABLE(org.jooq.Configuration configuration, org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE... array) {
		this(configuration);
		set(array);
	}

	public U_ADDRESS_TABLE(org.jooq.Configuration configuration, java.util.List<? extends org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> list) {
		this(configuration);
		setList(list);
	}
}
