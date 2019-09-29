package com.test.assn.spring4.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SUBJECT")
public class Subject implements Serializable {

	private static final long serialVersionUID = -3360619333379833320L;
	@Id
	@Column(name = "SUBJECT_ID")
	private long subjectId;
	@Column(name = "SUBTITLE")
	private String subtitle;
	@Column(name = "DURATION_HOURS")
	private int durationInHours;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "SUBJECT_BOOK_ASSOCIATION",
	        joinColumns = {
	                @JoinColumn(name = "SUBJECT_ID")},
	        inverseJoinColumns = {
	                @JoinColumn(name = "BOOK_ID")})
	private Set<Book> references = new HashSet<>();
	
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public int getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}
	public Set<Book> getReferences() {
		return references;
	}
	public void setReferences(Set<Book> references) {
		this.references = references;
	}
}
