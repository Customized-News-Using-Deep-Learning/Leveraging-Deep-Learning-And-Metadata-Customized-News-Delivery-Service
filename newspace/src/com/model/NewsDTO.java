package com.model;

public class NewsDTO {
	private int news_num;
	private String news_title;
	private String news_contents;
	private String news_img;
	private String news_summary;
	private String news_writer;
	private String news_media;
	private String news_time;
	private int news_meta;
	private int news_cate;
	private int news_views;
	
	public NewsDTO(int news_num, String news_title, String news_contents, String news_img, String news_summary,
			String news_writer, String news_media, String news_time, int news_meta, int news_cate, int news_views) {
		super();
		this.news_num = news_num;
		this.news_title = news_title;
		this.news_contents = news_contents;
		this.news_img = news_img;
		this.news_summary = news_summary;
		this.news_writer = news_writer;
		this.news_media = news_media;
		this.news_time = news_time;
		this.news_meta = news_meta;
		this.news_cate = news_cate;
		this.news_views = news_views;
	}
	
	public NewsDTO(int news_num, String news_title) {
		super();
		this.news_num = news_num;
		this.news_title = news_title;
	}
	
	
	
	public int getNews_num() {
		return news_num;
	}

	public void setNews_num(int news_num) {
		this.news_num = news_num;
	}

	public String getNews_title() {
		return news_title;
	}

	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}

	public String getNews_contents() {
		return news_contents;
	}

	public void setNews_contents(String news_contents) {
		this.news_contents = news_contents;
	}

	public String getNews_img() {
		return news_img;
	}

	public void setNews_img(String news_img) {
		this.news_img = news_img;
	}

	public String getNews_writer() {
		return news_writer;
	}

	public void setNews_writer(String news_writer) {
		this.news_writer = news_writer;
	}

	public String getNews_media() {
		return news_media;
	}

	public void setNews_media(String news_media) {
		this.news_media = news_media;
	}

	public String getNews_time() {
		return news_time;
	}

	public void setNews_time(String news_time) {
		this.news_time = news_time;
	}

	public int getNews_meta() {
		return news_meta;
	}

	public void setNews_meta(int news_meta) {
		this.news_meta = news_meta;
	}

	public int getNews_cate() {
		return news_cate;
	}

	public void setNews_cate(int news_cate) {
		this.news_cate = news_cate;
	}

	public String getNews_summary() {
		return news_summary;
	}

	public void setNews_summary(String news_summary) {
		this.news_summary = news_summary;
	}

	public int getNews_views() {
		return news_views;
	}

	public void setNews_views(int news_views) {
		this.news_views = news_views;
	}
	
}
