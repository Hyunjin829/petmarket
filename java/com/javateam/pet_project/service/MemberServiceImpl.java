package com.javateam.pet_project.service;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javateam.pet_project.dao.MemberDao;
import com.javateam.pet_project.dto.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;

	@Override
	public Map<String, Object> join(Map<String, Object> param) {

		Map<String, Object> rs = new HashMap<String, Object>();

		String memberId = (String) param.get("memberId");
		Member member = memberDao.getMemberBymemberId(memberId);

		if (member == null) {
			memberDao.join(param);

			int id = ((BigInteger) param.get("id")).intValue();
			rs.put("resultCode", "S-1");
			rs.put("id", id);
			rs.put("msg", "회원 가입 완료");
		} else {
			rs.put("resultCode", "F-1");
			rs.put("msg", "이미 존재하는 아이디 입니다.");
		}

		return rs;
	}

	@Override
	public Map<String, Object> checkLoginAvailable(Map<String, Object> param) {
		Map<String, Object> rs = new HashMap<String, Object>();

		String memberId = (String) param.get("memberId");
		String memberPw = (String) param.get("memberPw");
		Member member = memberDao.getMemberBymemberId(memberId);

		if (member == null) {
			rs.put("resultCode", "F-1");
			rs.put("msg", "해당 회원이 존재하지 않습니다.");
		} else if (member.getMemberPw().equals(memberPw) == false) {
			rs.put("resultCode", "F-2");
			rs.put("msg", "비밀번호가 일치하지 않습니다.");
		} else {
			rs.put("resultCode", "S-1");
			rs.put("msg", "로그인 가능");
			rs.put("id", member.getId());
		}

		return rs;
	}

	@Override
	public Member getMemberById(int id) {
		return memberDao.getMemberById(id);
	}

	@Override
	public boolean myInfoUpdateByMemberId(Member member) {
		return memberDao.myInfoUpdateByMemberId(member);
	}

	
}
