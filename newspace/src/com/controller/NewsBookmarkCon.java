package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.NewsBookmarkDAO;
import com.model.NewsBookmarkDTO;

import front.ICommand;

public class NewsBookmarkCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		HttpSession session = request.getSession();
		if(session.getAttribute("id") == null) {
			moveURL = "login.jsp";
		}else {
			int news_num = Integer.parseInt(request.getParameter("news_no"));
			int doing = Integer.parseInt(request.getParameter("do"));
			NewsBookmarkDAO dao = NewsBookmarkDAO.getDAO();
			NewsBookmarkDTO dto = new NewsBookmarkDTO((String)session.getAttribute("id"), news_num);
			
			if(doing == 1) {
				int result = dao.delNewsBookmark(dao.searchNewsBookmark(dto));
				session.removeAttribute("bm_num");
			}else {
				int result = dao.setNewsBookmark(dto);
				session.setAttribute("bm_num", dao.searchNewsBookmark(dto));
			}
			moveURL = request.getHeader("referer");
		}
		return moveURL;
	}

}
