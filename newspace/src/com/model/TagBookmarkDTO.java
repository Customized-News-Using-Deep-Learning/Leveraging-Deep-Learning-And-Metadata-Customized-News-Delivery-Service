package com.model;

public class TagBookmarkDTO {
	private String member_id;
	private int tag_num;
	
	public TagBookmarkDTO(String member_id, int tag_num) {
		super();
		this.member_id = member_id;
		this.tag_num = tag_num;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public int getTag_num() {
		return tag_num;
	}

	public void setTag_num(int tag_num) {
		this.tag_num = tag_num;
	}
	
}
