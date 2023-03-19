package com.jsp.controller;

import com.jsp.dao.BooksDao;
import com.jsp.dto.Books;

public class TestUpdate {
public static void main(String[] args) {
	BooksDao booksdao=new BooksDao();
	Books books=new Books();
	books.setId(1);
	books.setBookname("Potter Harry");
	books.setAuthorname("R K J");
	
	int id=booksdao.UpdateBook(1,books);
	if (id!=0) {
		System.out.println("Data updated successfully");
	}
	else {
		System.out.println("Data not updated Successfully");
	}
}
}
