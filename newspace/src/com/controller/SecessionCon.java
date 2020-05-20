package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.MemberDAO;
import com.model.MemberDTO;

import front.ICommand;

public class SecessionCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		HttpSession session = request.getSession();
		String member_id = (String)session.getAttribute("id");
		String member_pw = request.getParameter("pw");
		
		MemberDTO dto = new MemberDTO(member_id, member_pw);
		MemberDAO dao = MemberDAO.getDAO();
		
		int result = dao.secession(dto);
		if(result > 0) {
			session.invalidate();
			moveURL = "home.jsp";
		}else {
			moveURL = "update.jsp";
		}
		return moveURL;
	}

}
