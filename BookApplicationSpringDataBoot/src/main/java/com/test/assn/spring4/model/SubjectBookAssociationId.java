package com.test.assn.spring4.model;

import java.io.Serializable;

public class SubjectBookAssociationId implements Serializable{
	private static final long serialVersionUID = 6202656455804697032L;
	private long subjectId;
	private long bookId;
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
}
