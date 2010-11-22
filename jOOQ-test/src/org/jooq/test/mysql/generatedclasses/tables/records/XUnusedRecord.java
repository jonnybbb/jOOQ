/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;


import java.sql.SQLException;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.SimpleSelectQuery;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.mysql.generatedclasses.tables.XUnused;


/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XUnusedRecord extends UpdatableRecordImpl<XUnusedRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XUnused.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XUnused.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public List<XUnusedRecord> getXUnuseds() throws SQLException {
		SimpleSelectQuery<XUnusedRecord> q = create().selectQuery(XUnused.X_UNUSED);
		q.addCompareCondition(XUnused.ID_REF, getValue(XUnused.ID));
		q.addCompareCondition(XUnused.NAME_REF, getValue(XUnused.NAME));
		q.execute();

		return q.getResult().getRecords();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setName(String value) {
		setValue(XUnused.NAME, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public String getName() {
		return getValue(XUnused.NAME);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [test.x_unused.ID_REF, test.x_unused.NAME_REF] REFERENCES x_unused [test.x_unused.ID, test.x_unused.NAME]
	 */
	public void setIdRef(Integer value) {
		setValue(XUnused.ID_REF, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [test.x_unused.ID_REF, test.x_unused.NAME_REF] REFERENCES x_unused [test.x_unused.ID, test.x_unused.NAME]
	 */
	public Integer getIdRef() {
		return getValue(XUnused.ID_REF);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [test.x_unused.ID_REF, test.x_unused.NAME_REF] REFERENCES x_unused [test.x_unused.ID, test.x_unused.NAME]
	 */
	public XUnusedRecord getXUnused() throws SQLException {
		SimpleSelectQuery<XUnusedRecord> q = create().selectQuery(XUnused.X_UNUSED);
		q.addCompareCondition(XUnused.ID, getValue(XUnused.ID_REF));
		q.addCompareCondition(XUnused.NAME, getValue(XUnused.NAME_REF));
		q.execute();

		List<XUnusedRecord> result = q.getResult().getRecords();
		return result.size() == 1 ? result.get(0) : null;
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [test.x_unused.ID_REF, test.x_unused.NAME_REF] REFERENCES x_unused [test.x_unused.ID, test.x_unused.NAME]
	 */
	public void setNameRef(String value) {
		setValue(XUnused.NAME_REF, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [test.x_unused.ID_REF, test.x_unused.NAME_REF] REFERENCES x_unused [test.x_unused.ID, test.x_unused.NAME]
	 */
	public String getNameRef() {
		return getValue(XUnused.NAME_REF);
	}

	public XUnusedRecord(Configuration configuration) {
		super(configuration, XUnused.X_UNUSED);
	}
}
