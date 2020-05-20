package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.NewsDAO;
import com.model.NewsDTO;
import com.model.TagDAO;
import com.model.TagDTO;

import front.ICommand;

public class MemberBookmarkCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		NewsDAO ndao = NewsDAO.getDAO();
		TagDAO tdao = TagDAO.getDAO();
		
		HttpSession session = request.getSession();
		ArrayList<NewsDTO> news_list = ndao.getNewsBookmark((String)session.getAttribute("id"));
		ArrayList<TagDTO> tag_list = tdao.getTagBookmark((String)session.getAttribute("id"));
		
		session.setAttribute("news_list", news_list);
		session.setAttribute("tag_list", tag_list);
		
		moveURL = "bookmark.jsp";
		return moveURL;
	}

}
