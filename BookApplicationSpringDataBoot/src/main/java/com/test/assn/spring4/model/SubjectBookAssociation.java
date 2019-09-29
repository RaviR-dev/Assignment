package com.test.assn.spring4.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "SUBJECT_BOOK_ASSOCIATION")
@IdClass(SubjectBookAssociationId.class)
public class SubjectBookAssociation {
	@Id
	@Column(name = "SUBJECT_ID")
	private long subjectId;
	@Id
	@Column(name = "BOOK_ID")
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
