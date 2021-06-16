package com.javateam.pet_project.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.javateam.pet_project.dto.Member;
import com.javateam.pet_project.service.MemberService;

import lombok.extern.java.Log;

@Component("beforeActionInterceptor")
@Log
public class BeforeActionInterceptor implements HandlerInterceptor {
	@Autowired
	private MemberService memberService;

	@Value("${custom.logoText}")
	String logoText;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		request.setAttribute("logoText", logoText);

		HttpSession session = request.getSession();

		Integer loginedMemberId = (Integer) session.getAttribute("loginedMemberId");

		if (loginedMemberId == null) {
			loginedMemberId = 0;
		}
		else {
			Member member = memberService.getMemberById(loginedMemberId);
			
			 request.setAttribute("loginedMember", member);
			 request.setAttribute("loginedMemberName", member.getMemberName());
			 
		}

		request.setAttribute("loginedMemberId", loginedMemberId);
		request.setAttribute("isLogined", loginedMemberId != 0);

		log.info("loginedMemberId:" + loginedMemberId);
		
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}


}
