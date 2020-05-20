package com.model;

public class MemberDTO {
	private String member_id;
	private String member_pw;
	private String member_name;
	private String member_age;
	private String member_sex;
	private String member_email;
	
	public MemberDTO(String member_id, String member_pw, String member_name, String member_age, String member_sex,
			String member_email) {
		super();
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_name = member_name;
		this.member_age = member_age;
		this.member_sex = member_sex;
		this.member_email = member_email;
	}
	
	public MemberDTO(String member_id, String member_name, String member_age, String member_sex,
			String member_email) {
		super();
		this.member_id = member_id;
		this.member_name = member_name;
		this.member_age = member_age;
		this.member_sex = member_sex;
		this.member_email = member_email;
	}
	
	public MemberDTO(String member_id, String member_pw, String member_age, String member_email) {
		super();
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_age = member_age;
		this.member_email = member_email;
	}
	
	public MemberDTO(String member_id, String member_pw) {
		super();
		this.member_id = member_id;
		this.member_pw = member_pw;
	}
	
	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_age() {
		return member_age;
	}

	public void setMember_age(String member_age) {
		this.member_age = member_age;
	}

	public String getMember_sex() {
		return member_sex;
	}

	public void setMember_sex(String member_sex) {
		this.member_sex = member_sex;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	
}
