package com.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MemberDAO;
import com.model.MemberDTO;

import front.ICommand;

public class ContactCon implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String moveURL = null;
		String member_id = request.getParameter("id");
		String member_pw = request.getParameter("pw");
		String member_name = request.getParameter("name");
		String member_age = request.getParameter("age");
		String member_sex = request.getParameter("sex");
		String member_email = request.getParameter("email");
		
		MemberDAO dao = MemberDAO.getDAO();
		MemberDTO dto = new MemberDTO(member_id, member_pw, member_name, member_age, member_sex, member_email);
		
		int result = dao.contact(dto);
		
		if(result > 0) {
			moveURL = "home.jsp";	
		}else {
			moveURL = "contract.jsp";
		}
		return moveURL;
	}

}
