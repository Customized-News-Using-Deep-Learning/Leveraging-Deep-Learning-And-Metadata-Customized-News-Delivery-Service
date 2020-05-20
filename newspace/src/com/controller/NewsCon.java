package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.NewsDAO;
import com.model.NewsDTO;
import com.sun.org.apache.bcel.internal.generic.DALOAD;

import front.ICommand;

public class NewsCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		NewsDAO dao = NewsDAO.getDAO();
		
		int num = 1;
		int cate = 0;
		
		HttpSession session = request.getSession();
		if(request.getParameter("num") != null) {
			num = Integer.parseInt(request.getParameter("num"));
		}
		if(request.getParameter("cate") != null) {
			cate = Integer.parseInt(request.getParameter("cate"));
		}
		
		if(cate == 0) {
			session.setAttribute("newsCount", dao.allNewsCount());
			session.setAttribute("newsList", dao.loadAllNewsList(num));
			session.setAttribute("newsTopView", dao.getAllNewsTopView());
			moveURL = "home.jsp?num=" + num;
		}else {
			session.setAttribute("newsCount", dao.newsCount(cate));
			session.setAttribute("newsList", dao.loadNewsList(num, cate));
			session.setAttribute("newsTopView", dao.getCateNewsTopView(cate));
			moveURL = "home.jsp?num=" + num +"&cate=" + cate;
		}

		return moveURL;
	}

}
