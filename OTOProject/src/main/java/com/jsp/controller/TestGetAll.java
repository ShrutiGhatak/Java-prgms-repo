package com.jsp.controller;

import com.jsp.dao.PVDao;

public class TestGetAll {

	public static void main(String[] args) {
		
		PVDao pvd=new PVDao();
		pvd.GetAll();
	}
}
