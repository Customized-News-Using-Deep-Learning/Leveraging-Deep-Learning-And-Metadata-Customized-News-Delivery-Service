package com.model;

import java.sql.SQLException;
import java.util.ArrayList;

public class TagDAO extends BaseDAO {
	private static TagDAO dao;
	
	private TagDAO() {
		
	}
	
	public static TagDAO getDAO() {
		if(dao == null) {
			dao = new TagDAO();
		}
		return dao;
	}
	
	public ArrayList<TagDTO> loadNewsTags(int news_no){
		ArrayList<TagDTO> tagList = new ArrayList<TagDTO>();
		connect();
		try {
			String sql = "SELECT t.tag_num, t.tag_name FROM (SELECT * FROM news_tag WHERE news_num = ?) nt JOIN tag t ON t.TAG_NUM = nt.tag_num";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, news_no);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int tag_num = rs.getInt(1);
				String tag_name = rs.getString(2);
				tagList.add(new TagDTO(tag_num, tag_name));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return tagList;
	}
	
	public ArrayList<TagDTO> getTagBookmark(String member_id){
		ArrayList<TagDTO> list = new ArrayList<TagDTO>();
		connect();
		try {
			String sql = "SELECT tg.tag_num, tg.tag_name FROM (SELECT tag_num FROM member_tag WHERE member_id = ?) t INNER JOIN tag tg ON tg.TAG_NUM = t.tag_num";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member_id);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int tag_num = rs.getInt(1);
				String tag_name = rs.getString(2);
				list.add(new TagDTO(tag_num, tag_name));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
}
