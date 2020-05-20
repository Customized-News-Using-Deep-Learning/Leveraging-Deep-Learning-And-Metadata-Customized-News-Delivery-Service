package com.model;

public class NewsBookmarkDTO {
	private int bm_num;
	private String member_id;
	private int news_num;
	
	public NewsBookmarkDTO(int bm_num, String member_id, int news_num) {
		super();
		this.bm_num = bm_num;
		this.member_id = member_id;
		this.news_num = news_num;
	}

	
	public NewsBookmarkDTO(String member_id, int news_num) {
		super();
		this.member_id = member_id;
		this.news_num = news_num;
	}
	
	public int getBm_num() {
		return bm_num;
	}

	public void setBm_num(int bm_num) {
		this.bm_num = bm_num;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public int getNews_num() {
		return news_num;
	}

	public void setNews_num(int news_num) {
		this.news_num = news_num;
	}
	
}
