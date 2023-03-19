package com.jsp.controller;

import com.jsp.dao.BooksDao;
import com.jsp.dto.Books;

public class TestGetById {
public static void main(String[] args) {

	BooksDao dao=new BooksDao();
	Books books=new Books();
	
	Books books2=dao.GetById(1);
	//validation purpose
	
	if (books!=null) {
		System.out.println("-------------------------");
		System.out.println(books2.getId());
		System.out.println(books2.getBookname());
		System.out.println(books2.getAuthorname());
		System.out.println("----------------------------");
	}
	else {
		System.out.println("Data not found");
	}
	
}

}
