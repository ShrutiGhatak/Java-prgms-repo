package com.jsp.controller;

import com.jsp.dao.StdCoursDao;

public class TestGetAll {

	public static void main(String[] args) {
		
		StdCoursDao dao=new StdCoursDao();
		dao.GetAll();
	}
}
