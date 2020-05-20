package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.MemberDAO;
import com.model.MemberDTO;

import front.ICommand;

public class UpdateCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		HttpSession session = request.getSession();
		String member_id = (String)session.getAttribute("id");
		String member_pw = request.getParameter("pw");
		String member_pw2 = request.getParameter("pw2");
		String member_age = request.getParameter("age");
		String member_email = request.getParameter("email");

		if(member_pw.equals(member_pw2)) {
			MemberDAO dao = MemberDAO.getDAO();
			MemberDTO dto = new MemberDTO(member_id, member_pw, member_age, member_email);
			int result = dao.update(dto);
			if(result > 0) {
				moveURL = "home.jsp";
			}else {
				moveURL = "update.jsp";
			}
		}else {
			moveURL = "update.jsp";
		}

		return moveURL;
	}

}
