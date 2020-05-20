package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.TagBookmarkDAO;
import com.model.TagBookmarkDTO;

import front.ICommand;

public class TagBookmarkCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		HttpSession session = request.getSession();
		if(session.getAttribute("id") == null) {
			moveURL = "login.jsp";
		}else {
			String[] tags = request.getParameterValues("tag_ck");
			TagBookmarkDAO dao = TagBookmarkDAO.getDAO();
			
			for(String tag : tags) {
				TagBookmarkDTO dto = new TagBookmarkDTO((String)session.getAttribute("id"),Integer.parseInt(tag));
				int result = dao.setTagBookmark(dto);
			}
			moveURL = request.getHeader("referer");
		}
		return moveURL;
	}

}
