package com.jsp.dto;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "bookdetails")
public class Books {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bookname;
	private String Authorname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return Authorname;
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}
}
