package com.jsp.controller;

import com.jsp.dao.PVDao;

public class TestDeleteAll {

	public static void main(String[] args) {
		PVDao pvd=new PVDao();
		pvd.DelAll();
	}
}
