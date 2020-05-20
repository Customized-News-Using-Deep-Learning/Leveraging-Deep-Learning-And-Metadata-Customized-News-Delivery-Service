package com.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.NewsDAO;
import com.model.NewsDTO;

import front.ICommand;

public class NewsTagCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		HttpSession session = request.getSession();
		int num = 1;
		String tag_name = request.getParameter("tag_name");
		try {
			tag_name = URLDecoder.decode(request.getParameter("tag_name"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		NewsDAO dao = NewsDAO.getDAO();
		
		if(request.getParameter("num") != null) {
			num = Integer.parseInt(request.getParameter("num"));
		}
		if(request.getParameter("meta") != null) {
			int meta = Integer.parseInt(request.getParameter("meta"));
			session.setAttribute("newsTagCount", dao.tagMetaNewsCount(tag_name, meta));
			session.setAttribute("newsTagList", dao.loadTagMetaNewsList(num, tag_name, meta));
			moveURL = "tagList.jsp?num="+num+"&meta="+meta;
		}else {
			session.setAttribute("newsTagCount", dao.tagNewsCount(tag_name));
			session.setAttribute("newsTagList", dao.loadTagNewsList(num, tag_name));
			moveURL = "tagList.jsp?num="+num;
		}

		session.setAttribute("tag_name", tag_name);
		return moveURL;
	}

}
