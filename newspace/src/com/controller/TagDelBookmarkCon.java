package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.NewsBookmarkDAO;
import com.model.NewsBookmarkDTO;
import com.model.TagBookmarkDAO;
import com.model.TagBookmarkDTO;

import front.ICommand;

public class TagDelBookmarkCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		HttpSession session = request.getSession();
		TagBookmarkDAO dao = TagBookmarkDAO.getDAO();
		
		String[] tags = request.getParameterValues("tag_ck");
		for(String tag : tags) {
			TagBookmarkDTO dto = new TagBookmarkDTO((String)session.getAttribute("id"), Integer.parseInt(tag));
			int result = dao.delTagBookmark(dto);
		}
		moveURL = "MemberBookmarkService.do";
		return moveURL;
	}

}
