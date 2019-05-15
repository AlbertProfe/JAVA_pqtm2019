package com.java.so;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Page implements Serializable  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String text;
	private String font;

	// uno a uno
	// modificar nuestro modelo para permitir lazy fetching
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_title")
	private Book book;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Page(String text, String font, Book book) {
		super();
		this.text = text;
		this.font = font;
		this.book = book;
	}

	public Page() {
		super();
	}

	public Page(int id) {
		super();
		this.id = id;
	}

}
