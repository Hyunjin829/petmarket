package com.javateam.pet_project.entity;

import java.util.Date;

import lombok.Data;

@Data
public class CommentDto {
	private int commentNumber;        // 댓글번호(고유)
	private String memberId;          // 회원아이디
	private String memberNickname;    // 회원닉네임
	private String message;           // 댓글메시지
	private Date writeDate;           // 등록일자
	private String productName;       // 상품이름  
}
