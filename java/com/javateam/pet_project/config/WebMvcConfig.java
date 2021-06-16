package com.javateam.pet_project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	// beforeActionInterceptor 인터셉터 불러오기
	@Autowired
	@Qualifier("beforeActionInterceptor")
	HandlerInterceptor beforeActionInterceptor;

	// 이 함수는 인터셉터를 적용하는 역할
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// beforeActionInterceptor를 모든 액션(/**)에 연결. 단 /resource로 시작하는 액션은 제외
		registry.addInterceptor(beforeActionInterceptor).addPathPatterns("/**").excludePathPatterns("/css/**")
				.excludePathPatterns("/js/**");
	}

}
