package com.model;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class NewsDAO extends BaseDAO{
	private static NewsDAO dao;
	
	private NewsDAO() {
		
	}
	
	public static NewsDAO getDAO() {
		if(dao==null) {
			dao = new NewsDAO();
		}
		return dao;
	}
	
	public ArrayList<NewsDTO> loadNewsList(int num, int cate){
		ArrayList<NewsDTO> list = new ArrayList<NewsDTO>();
		connect();
		try {
			String sql = "SELECT news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views FROM (SELECT @rownum:=@rownum+1 AS num, n.* FROM news n, (SELECT @rownum:=0) TMP WHERE news_cate = ?) n WHERE num > ? AND num < ? ORDER BY news_time DESC";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, cate);
			psmt.setInt(2, (num-1)*5);
			psmt.setInt(3, (num*5)+1);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int news_num = rs.getInt(1);
				String news_title = rs.getString(2);
				String news_contents = rs.getString(3);
				String news_img = rs.getString(4);
				String news_summary = rs.getString(5);
				String news_writer = rs.getString(6);
				String news_media = rs.getString(7);
				Date time = rs.getDate(8);
				SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				String news_time = transFormat.format(time);
				int news_meta = rs.getInt(9);
				int news_cate = rs.getInt(10);
				int news_views = rs.getInt(11);
				list.add(new NewsDTO(news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return list;
	}
	
	public ArrayList<NewsDTO> loadAllNewsList(int num){
		ArrayList<NewsDTO> list = new ArrayList<NewsDTO>();
		connect();
		try {
			String sql = "SELECT news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views FROM (SELECT @rownum:=@rownum+1 AS num, n.* FROM news n, (SELECT @rownum:=0) TMP) n WHERE num > ? AND num < ? ORDER BY news_time DESC";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, (num-1)*5);
			psmt.setInt(2, (num*5)+1);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int news_num = rs.getInt(1);
				String news_title = rs.getString(2);
				String news_contents = rs.getString(3);
				String news_img = rs.getString(4);
				String news_summary = rs.getString(5);
				String news_writer = rs.getString(6);
				String news_media = rs.getString(7);
				Date time = rs.getDate(8);
				SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				String news_time = transFormat.format(time);
				int news_meta = rs.getInt(9);
				int news_cate = rs.getInt(10);
				int news_views = rs.getInt(11);
				list.add(new NewsDTO(news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		return list;
	}
	
	public ArrayList<NewsDTO> loadAllMetaNewsList(int num, int meta){
		ArrayList<NewsDTO> list = new ArrayList<NewsDTO>();
		connect();
		try {
			String sql = "SELECT news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views FROM (SELECT @rownum:=@rownum+1 AS num, n.* FROM news n, (SELECT @rownum:=0) TMP WHERE news_meta = ?) n WHERE num > ? AND num < ? ORDER BY news_time DESC";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, meta);
			psmt.setInt(2, (num-1)*5);
			psmt.setInt(3, (num*5)+1);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int news_num = rs.getInt(1);
				String news_title = rs.getString(2);
				String news_contents = rs.getString(3);
				String news_img = rs.getString(4);
				String news_summary = rs.getString(5);
				String news_writer = rs.getString(6);
				String news_media = rs.getString(7);
				Date time = rs.getDate(8);
				SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				String news_time = transFormat.format(time);
				int news_meta = rs.getInt(9);
				int news_cate = rs.getInt(10);
				int news_views = rs.getInt(11);
				list.add(new NewsDTO(news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		return list;
	}
	
	public ArrayList<NewsDTO> loadMetaNewsList(int num, int cate, int meta){
		ArrayList<NewsDTO> list = new ArrayList<NewsDTO>();
		connect();
		try {
			String sql = "SELECT news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views FROM (SELECT @rownum:=@rownum+1 AS num, n.* FROM news n, (SELECT @rownum:=0) TMP WHERE news_cate = ? AND news_meta = ?) n WHERE num > ? AND num < ? ORDER BY news_time DESC";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, cate);
			psmt.setInt(2, meta);
			psmt.setInt(3, (num-1)*5);
			psmt.setInt(4, (num*5)+1);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int news_num = rs.getInt(1);
				String news_title = rs.getString(2);
				String news_contents = rs.getString(3);
				String news_img = rs.getString(4);
				String news_summary = rs.getString(5);
				String news_writer = rs.getString(6);
				String news_media = rs.getString(7);
				Date time = rs.getDate(8);
				SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				String news_time = transFormat.format(time);
				int news_meta = rs.getInt(9);
				int news_cate = rs.getInt(10);
				int news_views = rs.getInt(11);
				list.add(new NewsDTO(news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		return list;
	}
	
	public ArrayList<NewsDTO> loadTagNewsList(int num, String tag_name){
		ArrayList<NewsDTO> list = new ArrayList<NewsDTO>();
		connect();
		try {
			String sql = "SELECT n.news_num, n.news_title, n.news_contents, n.news_img, n.news_summary, n.news_writer, n.news_media, n.news_time, n.news_meta, n.news_cate, n.news_views FROM (SELECT @rownum:=@rownum+1 AS num, n.* FROM (SELECT n.news_num, n.news_title, n.news_contents, n.news_img, n.news_summary, n.news_writer, n.news_media, n.news_time, n.news_meta, n.news_cate, n.news_views FROM (SELECT nt.news_num FROM (SELECT tag_num FROM tag WHERE tag_name = ?) tg INNER JOIN news_tag nt ON nt.tag_num = tg.tag_num) nn INNER JOIN news n ON n.news_num = nn.news_num ORDER BY n.news_time DESC) n, (SELECT @rownum:=0) TMP) n WHERE num > ? AND num < ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tag_name);
			psmt.setInt(2, (num-1)*5);
			psmt.setInt(3, (num*5)+1);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int news_num = rs.getInt(1);
				String news_title = rs.getString(2);
				String news_contents = rs.getString(3);
				String news_img = rs.getString(4);
				String news_summary = rs.getString(5);
				String news_writer = rs.getString(6);
				String news_media = rs.getString(7);
				Date time = rs.getDate(8);
				SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				String news_time = transFormat.format(time);
				int news_meta = rs.getInt(9);
				int news_cate = rs.getInt(10);
				int news_views = rs.getInt(11);
				list.add(new NewsDTO(news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		return list;
	}


	public ArrayList<NewsDTO> loadTagMetaNewsList(int num, String tag_name, int meta) {
		// TODO Auto-generated method stub
		ArrayList<NewsDTO> list = new ArrayList<NewsDTO>();
		connect();
		try {
			String sql = "SELECT n.news_num, n.news_title, n.news_contents, n.news_img, n.news_summary, n.news_writer, n.news_media, n.news_time, n.news_meta, n.news_cate, n.news_views FROM (SELECT @rownum:=@rownum+1 AS num, n.* FROM (SELECT n.news_num, n.news_title, n.news_contents, n.news_img, n.news_summary, n.news_writer, n.news_media, n.news_time, n.news_meta, n.news_cate, n.news_views FROM (SELECT nt.news_num FROM (SELECT tag_num FROM tag WHERE tag_name = ?) tg INNER JOIN news_tag nt ON nt.tag_num = tg.tag_num) nn INNER JOIN news n ON n.news_num = nn.news_num ORDER BY n.news_time DESC) n, (SELECT @rownum:=0) TMP) n WHERE num > ? AND num < ? AND n.news_meta = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tag_name);
			psmt.setInt(2, (num-1)*5);
			psmt.setInt(3, (num*5)+1);
			psmt.setInt(4, meta);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int news_num = rs.getInt(1);
				String news_title = rs.getString(2);
				String news_contents = rs.getString(3);
				String news_img = rs.getString(4);
				String news_summary = rs.getString(5);
				String news_writer = rs.getString(6);
				String news_media = rs.getString(7);
				Date time = rs.getDate(8);
				SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				String news_time = transFormat.format(time);
				int news_meta = rs.getInt(9);
				int news_cate = rs.getInt(10);
				int news_views = rs.getInt(11);
				list.add(new NewsDTO(news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		return list;
	}
	
	public int newsCount(int cate) {
		int count = 0;
		connect();
		try {
			String sql = "SELECT COUNT(num) FROM (SELECT @rownum:=@rownum+1 AS num, n.* FROM news n, (SELECT @rownum:=0) TMP WHERE news_cate = ?) n";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, cate);
			rs = psmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return count;
	}
	
	public int allNewsCount() {
		int count = 0;
		connect();
		try {
			String sql = "SELECT COUNT(num) FROM (SELECT @rownum:=@rownum+1 AS num, n.* FROM news n, (SELECT @rownum:=0) TMP) n";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return count;
	}
	
	public int allMetaNewsCount(int meta) {
		int count = 0;
		connect();
		try {
			String sql = "SELECT COUNT(num) FROM (SELECT @rownum:=@rownum+1 AS num, n.* FROM news n, (SELECT @rownum:=0) TMP) n WHERE news_meta = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, meta);
			rs = psmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return count;
	}
	
	public int metaNewsCount(int cate, int meta) {
		int count = 0;
		connect();
		try {
			String sql = "SELECT COUNT(num) FROM (SELECT @rownum:=@rownum+1 AS num, n.* FROM news n, (SELECT @rownum:=0) TMP) n WHERE news_cate = ? AND news_meta = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, cate);
			psmt.setInt(2, meta);
			rs = psmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return count;
	}
	
	public int tagNewsCount(String tag_name) {
		int count = 0;
		connect();
		try {
			String sql = "SELECT COUNT(num) FROM (SELECT @rownum:=@rownum+1 AS num, n.* FROM (SELECT n.news_num, n.news_title, n.news_contents, n.news_img, n.news_summary, n.news_writer, n.news_media, n.news_time, n.news_meta, n.news_cate, n.news_views FROM (SELECT nt.news_num FROM (SELECT tag_num FROM tag WHERE tag_name = ?) tg INNER JOIN news_tag nt ON nt.tag_num = tg.tag_num) nn INNER JOIN news n ON n.news_num = nn.news_num ORDER BY n.news_time DESC) n, (SELECT @rownum:=0) TMP) n";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tag_name);
			rs = psmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return count;
	}
	
	public Object tagMetaNewsCount(String tag_name, int meta) {
		// TODO Auto-generated method stub
		int count = 0;
		connect();
		try {
			String sql = "SELECT COUNT(*) FROM (SELECT @rownum:=@rownum+1 AS num, n.* FROM (SELECT n.news_num, n.news_title, n.news_contents, n.news_img, n.news_summary, n.news_writer, n.news_media, n.news_time, n.news_meta, n.news_cate, n.news_views FROM (SELECT nt.news_num FROM (SELECT tag_num FROM tag WHERE tag_name = ?) tg INNER JOIN news_tag nt ON nt.tag_num = tg.tag_num) nn INNER JOIN news n ON n.news_num = nn.news_num ORDER BY n.news_time DESC) n, (SELECT @rownum:=0) TMP) n WHERE n.news_meta = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tag_name);
			psmt.setInt(2, meta);
			rs = psmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return count;
	}

	
	public NewsDTO getNewsContent(int news_no) {
		NewsDTO news = null;
		connect();
		try {
			String sql = "SELECT * FROM news WHERE news_num = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, news_no);
			rs = psmt.executeQuery();
			if(rs.next()) {
				int news_num = rs.getInt(1);
				String news_title = rs.getString(2);
				String news_contents = rs.getString(3);
				String news_img = rs.getString(4);
				String news_summary = rs.getString(5);
				String news_writer = rs.getString(6);
				String news_media = rs.getString(7);
				Date time = rs.getDate(8);
				SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				String news_time = transFormat.format(time);
				int news_meta = rs.getInt(9);
				int news_cate = rs.getInt(10);
				int news_views = rs.getInt(11);
				news = new NewsDTO(news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views);
				return news;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return news;
	}
	
	public NewsDTO getAllNewsTopView() {
		NewsDTO news = null;
		connect();
		try {
			String sql = "SELECT * FROM news ORDER BY news_views DESC LIMIT 1";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			if(rs.next()) {
				int news_num = rs.getInt(1);
				String news_title = rs.getString(2);
				String news_contents = rs.getString(3);
				String news_img = rs.getString(4);
				String news_summary = rs.getString(5);
				String news_writer = rs.getString(6);
				String news_media = rs.getString(7);
				Date time = rs.getDate(8);
				SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				String news_time = transFormat.format(time);
				int news_meta = rs.getInt(9);
				int news_cate = rs.getInt(10);
				int news_views = rs.getInt(11);
				news = new NewsDTO(news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views);
				return news;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return news;
	}
	
	public NewsDTO getCateNewsTopView(int cate) {
		NewsDTO news = null;
		connect();
		try {
			String sql = "SELECT * FROM news WHERE news_cate = ? ORDER BY news_views DESC LIMIT 1";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, cate);
			rs = psmt.executeQuery();
			if(rs.next()) {
				int news_num = rs.getInt(1);
				String news_title = rs.getString(2);
				String news_contents = rs.getString(3);
				String news_img = rs.getString(4);
				String news_summary = rs.getString(5);
				String news_writer = rs.getString(6);
				String news_media = rs.getString(7);
				Date time = rs.getDate(8);
				SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				String news_time = transFormat.format(time);
				int news_meta = rs.getInt(9);
				int news_cate = rs.getInt(10);
				int news_views = rs.getInt(11);
				news = new NewsDTO(news_num, news_title, news_contents, news_img, news_summary, news_writer, news_media, news_time, news_meta, news_cate, news_views);
				return news;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return news;
	}
	
	public ArrayList<NewsDTO> getNewsBookmark(String member_id) {
		ArrayList<NewsDTO> list = new ArrayList<NewsDTO>();
		connect();
		try {
			String sql = "SELECT ns.news_num, ns.news_title FROM (SELECT news_num FROM book_mark WHERE member_id = ?) n INNER JOIN news ns ON ns.news_num = n.news_num";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member_id);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				int news_num = rs.getInt(1);
				String news_title = rs.getString(2);
				list.add(new NewsDTO(news_num, news_title));
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
