package com.model;

import java.sql.SQLException;

public class MemberDAO extends BaseDAO{
	private static MemberDAO dao;
	
	private MemberDAO() {
		
	}
	
	public static MemberDAO getDAO() {
		if(dao==null) {
			dao = new MemberDAO();
		}
		return dao;
	}
	
	public int contact(MemberDTO dto) {
		int result = 0;
		connect();
		try {
			String sql = "INSERT INTO member VALUES (?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getMember_id());
			psmt.setString(2, dto.getMember_pw());
			psmt.setString(3, dto.getMember_name());
			psmt.setString(4, dto.getMember_age());
			psmt.setString(5, dto.getMember_sex());
			psmt.setString(6, dto.getMember_email());
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	
	public MemberDTO login(MemberDTO dto) {
		MemberDTO member = null;
		connect();
		
		try {
			String sql = "SELECT member_id, member_name, member_age, member_sex, member_email FROM member WHERE member_id = ? AND member_pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getMember_id());
			psmt.setString(2, dto.getMember_pw());
			rs = psmt.executeQuery();
			if(rs.next()) {
				String member_id = rs.getString(1);
				String member_name = rs.getString(2);
				String member_age = rs.getString(3);
				String member_sex = rs.getString(4);
				String member_email = rs.getString(5);
				member = new MemberDTO(member_id, member_name, member_age, member_sex, member_email);
				return member;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return member;
	}
	
	public int update(MemberDTO dto) {
		int result = 0;
		connect();
		
		try {
			String sql = "UPDATE member SET member_pw = ?, member_age = ?, member_email = ? WHERE member_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getMember_pw());
			psmt.setString(2, dto.getMember_age());
			psmt.setString(3, dto.getMember_email());
			psmt.setString(4, dto.getMember_id());
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	
	public int secession(MemberDTO dto) {
		int result = 0;
		connect();
		
		try {
			String sql = "DELETE FROM member WHERE member_id = ? AND member_pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getMember_id());
			psmt.setString(2, dto.getMember_pw());
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
}
