package com.jsp.controller;

import com.jsp.dao.BooksDao;
import com.jsp.dto.Books;

public class TestSave {
public static void main(String[] args) {
	BooksDao dao=new BooksDao();
	Books books=new Books();
	books.setBookname("Twilight");
	books.setAuthorname("Stephen M");
	
	//Validation purpose
	
	Books books2=dao.SaveBook(books);
	if (books2!=null) {
		System.out.println("Data is inserted successfully");
	}
	else {
		System.out.println("Data is not inserted");
	}
}
}
