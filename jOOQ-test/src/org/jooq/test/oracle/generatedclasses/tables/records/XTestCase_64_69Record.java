/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.oracle.generatedclasses.tables.XTestCase_64_69;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_64_69Record extends UpdatableRecordImpl<XTestCase_64_69Record> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XTestCase_64_69.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XTestCase_64_69.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [TEST.X_TEST_CASE_64_69.UNUSED_ID] REFERENCES X_UNUSED [TEST.X_UNUSED.ID, TEST.X_UNUSED.NAME]
	 */
	public void setUnusedId(Integer value) {
		setValue(XTestCase_64_69.UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [TEST.X_TEST_CASE_64_69.UNUSED_ID] REFERENCES X_UNUSED [TEST.X_UNUSED.ID, TEST.X_UNUSED.NAME]
	 */
	public Integer getUnusedId() {
		return getValue(XTestCase_64_69.UNUSED_ID);
	}

	public XTestCase_64_69Record(Configuration configuration) {
		super(configuration, XTestCase_64_69.X_TEST_CASE_64_69);
	}
}
