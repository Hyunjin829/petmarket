package com.javateam.pet_project.service;

import java.util.Map;

import com.javateam.pet_project.dto.Member;

public interface MemberService {

	Map<String, Object> join(Map<String, Object> param);

	Map<String, Object> checkLoginAvailable(Map<String, Object> param);

	Member getMemberById(int id);
	
	boolean myInfoUpdateByMemberId(Member member);

}
