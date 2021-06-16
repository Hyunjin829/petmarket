package com.javateam.pet_project.entity;

import java.util.Date;

public class Comment {
	private int commentNumber;        // 댓글번호(고유)
	private String memberId;          // 회원아이디
	private String memberNickname;    // 회원닉네임
	private String message;           // 댓글메시지
	private Date writeDate;           // 등록일자
	private String productName;       // 상품이름  
	
	public Comment() {}

	public Comment(int commentNumber, String memberId, String memberNickname, String message, Date writeDate,
			String productName) {
		super();
		this.commentNumber = commentNumber;
		this.memberId = memberId;
		this.memberNickname = memberNickname;
		this.message = message;
		this.writeDate = writeDate;
		this.productName = productName;
	}

	public int getCommentNumber() {
		return commentNumber;
	}

	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Comment [commentNumber=" + commentNumber + ", memberId=" + memberId + ", memberNickname="
				+ memberNickname + ", message=" + message + ", writeDate=" + writeDate + ", productName=" + productName
				+ "]";
	}
	
	

}
