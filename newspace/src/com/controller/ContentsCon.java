package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.NewsBookmarkDAO;
import com.model.NewsBookmarkDTO;
import com.model.NewsDAO;
import com.model.NewsDTO;
import com.model.TagDAO;
import com.model.TagDTO;
import com.model.WordDAO;
import com.model.WordDTO;

import front.ICommand;

public class ContentsCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		int news_no = Integer.parseInt(request.getParameter("news_no"));
		HttpSession session = request.getSession();
		session.removeAttribute("bm_num");
		
		NewsDAO ndao = NewsDAO.getDAO();
		TagDAO  tdao = TagDAO.getDAO();
		WordDAO wdao = WordDAO.getDAO();
		NewsBookmarkDAO bdao = NewsBookmarkDAO.getDAO();
		NewsBookmarkDTO dto = new NewsBookmarkDTO((String)session.getAttribute("id"),news_no);
		
		NewsDTO newsInfo = ndao.getNewsContent(news_no);
		ArrayList<TagDTO> tag_list = tdao.loadNewsTags(news_no);
		ArrayList<WordDTO> word_list = wdao.loadWordList(news_no);
		
		if(session.getAttribute("id") != null) {
			int bm_num = bdao.searchNewsBookmark(dto);
			if(bm_num > 0) {
				session.setAttribute("bm_num", bm_num);
			}else {
				session.removeAttribute("bm_num");
			}
		}
		
		session.setAttribute("newsInfo", newsInfo);
		session.setAttribute("tag_list", tag_list);
		session.setAttribute("word_list", word_list);
		
		moveURL = "contents.jsp?news_no="+newsInfo.getNews_num();
		return moveURL;
	}

}
