package com.javateam.pet_project.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.javateam.pet_project.dto.Member;

@Mapper
public interface MemberDao {

	void join(Map<String, Object> param);

	Member getMemberBymemberId(@Param("memberId") String memberId);

	Member getMemberById(@Param("id") int id);
	
	boolean myInfoUpdateByMemberId(Member member);

}
