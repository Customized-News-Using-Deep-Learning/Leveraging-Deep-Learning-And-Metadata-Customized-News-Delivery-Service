package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.NewsDAO;
import com.model.NewsDTO;

import front.ICommand;

public class NewsMetaCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		NewsDAO dao = NewsDAO.getDAO();
		int num = 1;
		int cate = 0;
		int meta = Integer.parseInt(request.getParameter("meta"));

		HttpSession session = request.getSession();
		if(request.getParameter("num") != null) {
			num = Integer.parseInt(request.getParameter("num"));
		}
		if(request.getParameter("cate") != null) {
			cate = Integer.parseInt(request.getParameter("cate"));
		}
		
		if(cate == 0) {
			session.setAttribute("newsCount", dao.allMetaNewsCount(meta));
			session.setAttribute("newsList", dao.loadAllMetaNewsList(num, meta));
			moveURL = "home.jsp?num=" + num + "&meta=" + meta;
		}else {
			session.setAttribute("newsCount", dao.metaNewsCount(cate, meta));
			session.setAttribute("newsList", dao.loadMetaNewsList(num, cate, meta));
			moveURL = "home.jsp?num=" + num +"&cate=" + cate +"&meta=" + meta;
		}
		
		return moveURL;
	}

}
