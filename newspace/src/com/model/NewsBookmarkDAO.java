package com.model;

import java.sql.SQLException;

public class NewsBookmarkDAO extends BaseDAO {
	private static NewsBookmarkDAO dao;
	
	private NewsBookmarkDAO() {
		
	}
	
	public static NewsBookmarkDAO getDAO() {
		if(dao == null) {
			dao = new NewsBookmarkDAO();
		}
		return dao;
	}
	
	public int setNewsBookmark(NewsBookmarkDTO dto) {
		int result = 0;
		connect();
		
		try {
			String sql = "INSERT INTO book_mark (member_id, news_num) VALUES (?, ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getMember_id());
			psmt.setInt(2, dto.getNews_num());
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
		
	public int delNewsBookmark(int bm_num) {
		int result = 0;
		connect();
		try {
			String sql = "DELETE FROM book_mark WHERE bm_num = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bm_num);
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}

	public int searchNewsBookmark(NewsBookmarkDTO dto) {
		// TODO Auto-generated method stub
		int result = 0;
		connect();
		try {
			String sql = "SELECT bm_num FROM book_mark WHERE member_id = ? AND news_num = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getMember_id());
			psmt.setInt(2, dto.getNews_num());
			rs = psmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}

	
}
