package com.test.assn.spring4.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "BOOK")
public class Book implements Serializable{

	private static final long serialVersionUID = 2639968733754875422L;
	@Id
	@Column(name = "BOOK_ID")
	private long bookId;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "VOLUME")
	private int volume;
	@Column(name = "PUBLISH_DATE")
	private LocalDate publishDate;
	
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
}
