package com.javateam.pet_project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javateam.pet_project.dto.Member;
import com.javateam.pet_project.entity.Shop;
import com.javateam.pet_project.service.MemberService;
import com.javateam.pet_project.service.ShopService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller("ShopController")
public class ShopController {
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private ShopService service;
	
	/*
	 * localhost:8383/shop
	 * 전체상품조회
	 * 
	 */
	@RequestMapping("/shop") 
	public String AllList(Model model) {
		
		List<Shop> list = service.getList();
		
		model.addAttribute("list",list);
		
		return "shop";
	}
	
	
	/*
	 * localhost:8383/shopDetail
	 * 상품클릭시 상품상세조회
	 * 
	 */
	@RequestMapping("/shopDetail")
	public String detail(HttpServletRequest request,@RequestParam("productName") String productName,
						 Model model) {
		log.info("productName : " + productName);
		List<Shop> list = service.getListDetail(productName);
		model.addAttribute("list",list);
		
		HttpSession session = request.getSession();

		Integer loginedMemberId = (Integer) session.getAttribute("loginedMemberId");
		
		log.info("sessionLoginId " + loginedMemberId);
		
		Member member = memberService.getMemberById(loginedMemberId);
		request.setAttribute("loginedMemberName", member.getMemberName());
		
		log.info("loginedMemberName " + member.getMemberName());
		String loginedMemberName = member.getMemberName();
		
		
		
		return "shopDetail";
	}
	

	/*
	 * localhost:8383/shopCatFeed
	 * shop-catshop-사료
	 * 
	 * petType : "cat", productCategory :"사료" 인것만 찾아서 넘기기
	 */
	@RequestMapping("/shopCatFeed")
	public String shopCatFeed(@RequestParam("petType") String petType, 
							  @RequestParam("productCategory") String productCategory,
							Model model) {
		log.info("petType : " + petType);
		log.info("productCategory : " + productCategory);
		
		List<Shop> list = service.getListByCate(petType, productCategory);
		model.addAttribute("list", list);
		log.info("list : " + list);
		return "shop";
	}
	
	/*
	 * localhost:8383/shopCatSnack
	 * shop-catshop-간식
	 * 
	 * petType : "cat", productCategory :"간식" 인것만 찾아서 넘기기
	 */
	@RequestMapping("/shopCatSnack")
	public String shopCatSnack(@RequestParam("petType") String petType, 
							   @RequestParam("productCategory") String productCategory,
							Model model) {
		log.info("petType : " + petType);
		log.info("productCategory : " + productCategory);
		
		List<Shop> list = service.getListByCate(petType, productCategory);
		model.addAttribute("list", list);
		log.info("list : " + list);
		return "shop";
	}	
	
	/*
	 * localhost:8383/shopCatClothing
	 * shop-catshop-의류
	 * 
	 * petType : "cat", productCategory :"의류" 인것만 찾아서 넘기기
	 */
	@RequestMapping("/shopCatClothing")
	public String shopCatClothing(@RequestParam("petType") String petType, 
							   @RequestParam("productCategory") String productCategory,
							Model model) {
		log.info("petType : " + petType);
		log.info("productCategory : " + productCategory);
		
		List<Shop> list = service.getListByCate(petType, productCategory);
		model.addAttribute("list", list);
		log.info("list : " + list);
		return "shop";
	}	
	
	/*
	 * localhost:8383/shopCatGoods
	 * shop-catshop-용품
	 * 
	 * petType : "cat", productCategory :"용품" 인것만 찾아서 넘기기
	 */
	@RequestMapping("/shopCatGoods")
	public String shopCatGoods(@RequestParam("petType") String petType, 
							   @RequestParam("productCategory") String productCategory,
							Model model) {
		log.info("petType : " + petType);
		log.info("productCategory : " + productCategory);
		
		List<Shop> list = service.getListByCate(petType, productCategory);
		model.addAttribute("list", list);
		log.info("list : " + list);
		return "shop";
	}	
	
	/*
	 * localhost:8383/shopCatToy
	 * shop-catshop-장난감
	 * 
	 * petType : "cat", productCategory :"장난감" 인것만 찾아서 넘기기
	 */
	@RequestMapping("/shopCatToy")
	public String shopCatToy(@RequestParam("petType") String petType, 
							   @RequestParam("productCategory") String productCategory,
							Model model) {
		log.info("petType : " + petType);
		log.info("productCategory : " + productCategory);
		
		List<Shop> list = service.getListByCate(petType, productCategory);
		model.addAttribute("list", list);
		log.info("list : " + list);
		return "shop";
	}	
	
	/*
	 * localhost:8383/shopDogFeed
	 * shop-dogshop-사료
	 * 
	 * petType : "dog", productCategory :"사료" 인것만 찾아서 넘기기
	 */
	@RequestMapping("/shopDogFeed")
	public String shopDogFeed(@RequestParam("petType") String petType, 
							   @RequestParam("productCategory") String productCategory,
							Model model) {
		log.info("petType : " + petType);
		log.info("productCategory : " + productCategory);
		
		List<Shop> list = service.getListByCate(petType, productCategory);
		model.addAttribute("list", list);
		log.info("list : " + list);
		return "shop";
	}	

	
	
	/*
	 * localhost:8383/shopDogSnack
	 * shop-dogshop-간식
	 * 
	 * petType : "dog", productCategory :"간식" 인것만 찾아서 넘기기
	 */
	@RequestMapping("/shopDogSnack")
	public String shopDogSnack(@RequestParam("petType") String petType, 
							   @RequestParam("productCategory") String productCategory,
							Model model) {
		log.info("petType : " + petType);
		log.info("productCategory : " + productCategory);
		
		List<Shop> list = service.getListByCate(petType, productCategory);
		model.addAttribute("list", list);
		log.info("list : " + list);
		return "shop";
	}	
	
	/*
	 * localhost:8383/shopDogClothing
	 * shop-dogshop-의류
	 * 
	 * petType : "dog", productCategory :"의류" 인것만 찾아서 넘기기
	 */
	@RequestMapping("/shopDogClothing")
	public String shopDogClothing(@RequestParam("petType") String petType, 
							   @RequestParam("productCategory") String productCategory,
							Model model) {
		log.info("petType : " + petType);
		log.info("productCategory : " + productCategory);
		
		List<Shop> list = service.getListByCate(petType, productCategory);
		model.addAttribute("list", list);
		log.info("list : " + list);
		return "shop";
	}	
	
	/*
	 * localhost:8383/shopDogGoods
	 * shop-dogshop-용품
	 * 
	 * petType : "dog", productCategory :"용품" 인것만 찾아서 넘기기
	 */
	@RequestMapping("/shopDogGoods")
	public String shopDogGoods(@RequestParam("petType") String petType, 
							   @RequestParam("productCategory") String productCategory,
							Model model) {
		log.info("petType : " + petType);
		log.info("productCategory : " + productCategory);
		
		List<Shop> list = service.getListByCate(petType, productCategory);
		model.addAttribute("list", list);
		log.info("list : " + list);
		return "shop";
	}	
	/*
	 * localhost:8383/shopDogToy
	 * shop-dogshop-장난감
	 * 
	 * petType : "dog", productCategory :"장난감" 인것만 찾아서 넘기기
	 */
	@RequestMapping("/shopDogToy")
	public String shopDogToy(@RequestParam("petType") String petType, 
							   @RequestParam("productCategory") String productCategory,
							Model model) {
		log.info("petType : " + petType);
		log.info("productCategory : " + productCategory);
		
		List<Shop> list = service.getListByCate(petType, productCategory);
		model.addAttribute("list", list);
		log.info("list : " + list);
		return "shop";
	}	
	
}
