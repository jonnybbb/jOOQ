/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;


import java.sql.SQLException;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.SimpleSelectQuery;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.hsqldb.generatedclasses.enums.TLanguage;
import org.jooq.test.hsqldb.generatedclasses.tables.TAuthor;
import org.jooq.test.hsqldb.generatedclasses.tables.TBook;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBookRecord extends UpdatableRecordImpl<TBookRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(TBook.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(TBook.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [PUBLIC.T_BOOK.AUTHOR_ID] REFERENCES T_AUTHOR [PUBLIC.T_AUTHOR.ID]
	 */
	public void setAuthorId(Integer value) {
		setValue(TBook.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [PUBLIC.T_BOOK.AUTHOR_ID] REFERENCES T_AUTHOR [PUBLIC.T_AUTHOR.ID]
	 */
	public Integer getAuthorId() {
		return getValue(TBook.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [PUBLIC.T_BOOK.AUTHOR_ID] REFERENCES T_AUTHOR [PUBLIC.T_AUTHOR.ID]
	 */
	public TAuthorRecord getTAuthor() throws SQLException {
		SimpleSelectQuery<TAuthorRecord> q = create().selectQuery(TAuthor.T_AUTHOR);
		q.addCompareCondition(TAuthor.ID, getValue(TBook.AUTHOR_ID));
		q.execute();

		List<TAuthorRecord> result = q.getResult().getRecords();
		return result.size() == 1 ? result.get(0) : null;
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(String value) {
		setValue(TBook.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTitle() {
		return getValue(TBook.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(Integer value) {
		setValue(TBook.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getPublishedIn() {
		return getValue(TBook.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [PUBLIC.T_BOOK.LANGUAGE_ID] REFERENCES T_LANGUAGE [PUBLIC.T_LANGUAGE.ID]
	 */
	public void setLanguageId(TLanguage value) {
		setValue(TBook.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [PUBLIC.T_BOOK.LANGUAGE_ID] REFERENCES T_LANGUAGE [PUBLIC.T_LANGUAGE.ID]
	 */
	public TLanguage getLanguageId() {
		return getValue(TBook.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(String value) {
		setValue(TBook.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public String getContentText() {
		return getValue(TBook.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(TBook.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getContentPdf() {
		return getValue(TBook.CONTENT_PDF);
	}

	public TBookRecord(Configuration configuration) {
		super(configuration, TBook.T_BOOK);
	}
}
