package com.jsp.controller;

import com.jsp.dao.BooksDao;
import com.jsp.dto.Books;

public class TestDeleteById {
public static void main(String[] args) {
	BooksDao dao=new BooksDao();
	
	Books books=dao.DeleteById(2);
	if (books!=null) {
		System.out.println("Data deleted sucessfully");
	}
	else {
		System.out.println("Data is not deleted");
	}

}
}
