package com.model;

import java.sql.SQLException;
import java.util.ArrayList;

public class WordDAO extends BaseDAO {
	private static WordDAO dao;
	
	private WordDAO() {
		
	}
	
	public static WordDAO getDAO() {
		if(dao == null) {
			dao = new WordDAO();
		}
		return dao;
	}
	
	public ArrayList<WordDTO> loadWordList(int news_no){
		ArrayList<WordDTO> wordList = new ArrayList<WordDTO>();
		connect();
		try {
			String sql = "SELECT wd.word_num, wd.word_name, wd.dictionary, wd.field_name, n.news_num FROM (SELECT w.WORD_NUM, w.word_name, w.dictionary, wf.field_name FROM word w INNER JOIN word_field wf on w.FIELD_NUM = wf.field_num) wd INNER JOIN footnote fn INNER JOIN news n ON wd.word_num = fn.word_num AND n.news_num = fn.news_num WHERE n.news_num = ?";
			psmt = conn.prepareStatement(sql);	
			psmt.setInt(1, news_no);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int word_num = rs.getInt(1);
				String word_name = rs.getString(2);
				String dictionary = rs.getString(3);
				String field_name = rs.getString(4);
				wordList.add(new WordDTO(word_num, word_name, dictionary, field_name));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return wordList;
	}
}
