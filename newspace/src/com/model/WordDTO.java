package com.model;

public class WordDTO {
	private int word_num;
	private String word_name;
	private String dictionary;
	private String field_name;
	
	public WordDTO(int word_num, String word_name, String dictionary, String field_name) {
		super();
		this.word_num = word_num;
		this.word_name = word_name;
		this.dictionary = dictionary;
		this.field_name = field_name;
	}

	public int getWord_num() {
		return word_num;
	}

	public void setWord_num(int word_num) {
		this.word_num = word_num;
	}

	public String getWord_name() {
		return word_name;
	}

	public void setWord_name(String word_name) {
		this.word_name = word_name;
	}

	public String getDictionary() {
		return dictionary;
	}

	public void setDictionary(String dictionary) {
		this.dictionary = dictionary;
	}

	public String getField_name() {
		return field_name;
	}

	public void setField_name(String field_name) {
		this.field_name = field_name;
	}
	
}
