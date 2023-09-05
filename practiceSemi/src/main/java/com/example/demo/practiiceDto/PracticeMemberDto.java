package com.example.demo.practiiceDto;

public class PracticeMemberDto {
	
	private String memberId;
	private String memberPw;
	private String memberLevel;
	private int memberPoint;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}
	
	public PracticeMemberDto(String memberId, String memberPw, String memberLevel, int memberPoint) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberLevel = memberLevel;
		this.memberPoint = memberPoint;
	}
}
