package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import front.ICommand;

public class LogoutCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		HttpSession session = request.getSession();
		session.invalidate();
		moveURL = "NewsService.do?num=1";
		return moveURL;
	}

}
