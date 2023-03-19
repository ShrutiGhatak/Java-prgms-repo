package com.jsp.controller;

import com.jsp.dao.BankBranchDao;

public class TestGetAll {

	public static void main(String[] args) {
		
		BankBranchDao dao=new BankBranchDao();
		dao.GetAll();
	}
}
