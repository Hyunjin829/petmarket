package com.javateam.pet_project.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private int id;
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberNickname;
	private int memberPhone;
	private String memberAddress;
	private Date regDate;
}
