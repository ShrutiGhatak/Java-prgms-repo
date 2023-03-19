package com.jsp.controller;

import com.jsp.dao.MobileSimDao;

public class TestDelAll {

	public static void main(String[] args) {
		
		MobileSimDao dao=new MobileSimDao();
		dao.DelAll();
	}
}
