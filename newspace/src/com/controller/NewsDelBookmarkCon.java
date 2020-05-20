package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.NewsBookmarkDAO;
import com.model.NewsBookmarkDTO;
import com.model.TagBookmarkDAO;
import com.model.TagBookmarkDTO;

import front.ICommand;

public class NewsDelBookmarkCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		HttpSession session = request.getSession();
		NewsBookmarkDAO dao = NewsBookmarkDAO.getDAO();
		
		String[] news_no = request.getParameterValues("news_ck");
		for(String news : news_no) {
			NewsBookmarkDTO dto = new NewsBookmarkDTO((String)session.getAttribute("id"), Integer.parseInt(news));
			int result = dao.delNewsBookmark(dao.searchNewsBookmark(dto));
		}
		moveURL = "MemberBookmarkService.do";
		return moveURL;
	}

}
