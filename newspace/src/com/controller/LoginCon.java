package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.MemberDAO;
import com.model.MemberDTO;

import front.ICommand;

public class LoginCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		String member_id = request.getParameter("id");
		String member_pw = request.getParameter("pw");
		
		MemberDTO dto = new MemberDTO(member_id, member_pw);
		MemberDAO dao = MemberDAO.getDAO();
		
		MemberDTO member = dao.login(dto);
		if(member != null) {
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			session.setAttribute("id",member_id);
			moveURL = "home.jsp";
		}else {
			moveURL = "login.jsp";
		}
		return moveURL;
	}

}
