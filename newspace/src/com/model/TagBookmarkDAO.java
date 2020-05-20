package com.model;

import java.sql.SQLException;
import java.util.ArrayList;

public class TagBookmarkDAO extends BaseDAO {
	private static TagBookmarkDAO dao;
	
	private TagBookmarkDAO() {
		
	}

	public static TagBookmarkDAO getDAO() {
		if(dao == null) {
			dao = new TagBookmarkDAO();
		}
		return dao;
	}

	public int setTagBookmark(TagBookmarkDTO dto) {
		int result = 0;
		connect();
		
		try {
			String sql = "INSERT INTO member_tag VALUES (?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getMember_id());
			psmt.setInt(2, dto.getTag_num());
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	
	public int delTagBookmark(TagBookmarkDTO dto) {
		int result = 0;
		connect();
		try {
			String sql = "DELETE FROM member_tag WHERE member_id = ? AND tag_num = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getMember_id());
			psmt.setInt(2, dto.getTag_num());
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
