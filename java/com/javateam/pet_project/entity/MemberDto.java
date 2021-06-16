package com.javateam.pet_project.entity;

import java.util.Date;

import lombok.Data;

@Data
public class MemberDto {
	private int Id;
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberNickname;
	private int memberPhone; 
	private String memberAddress;
	private Date regDate;

}
