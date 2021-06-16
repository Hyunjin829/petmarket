package com.javateam.pet_project.controller;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javateam.pet_project.dto.Member;
import com.javateam.pet_project.entity.MemberDto;
import com.javateam.pet_project.entity.Pet;
import com.javateam.pet_project.entity.PetDto;
import com.javateam.pet_project.entity.Shop;
import com.javateam.pet_project.entity.ShopDto;
import com.javateam.pet_project.service.MemberService;
import com.javateam.pet_project.service.PetService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller("PageController")
public class PageController {
	
	@Autowired
	PetService petService;
	
	@Autowired
	MemberService memberService;

	/*
	 * localhost:8383/myPet
	 * 내 펫 정보  (mypage)
	 */
	@RequestMapping("/myPet") 
	public String myPet(Model model, HttpServletRequest request) {
		
		HttpSession session = request.getSession();

		Integer loginedMemberId = (Integer) session.getAttribute("loginedMemberId");
		
		log.info("sessionLoginId " + loginedMemberId);
		
		Pet pet = petService.getListByOwnerId(loginedMemberId);
		
		if(pet == null) {
			model.addAttribute("loginedMemberId", loginedMemberId);
			return "myPetInsert";
		}
		log.info("pet : " + pet);
		
		model.addAttribute("pet", pet);
		return "myPet";
	}
	
	/*
	 * localhost:8383/myPetUpdate
	 * 내 펫 정보 수정(mypage)
	 */
	@RequestMapping("/myPetUpdate")
	public String myPostUpdate( @RequestParam("ownerId") String ownerId, HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();

		Integer loginedMemberId = (Integer) session.getAttribute("loginedMemberId");
		
		log.info("sessionLoginId " + loginedMemberId);
		
		Pet pet = petService.getListByOwnerId(loginedMemberId);
		
		log.info("myPostUpdate pet : " + pet);
		model.addAttribute("pet", pet);
		
		return "myPetUpdate";
	}
	
	
	@RequestMapping(value = "/myPetUpdateAction", method = RequestMethod.POST)
	public String postUpdateAction( HttpServletRequest request, PetDto pet) throws IllegalStateException, IOException {

		log.info("myPetUpdateAction");
		log.info("pet:" + pet);

		log.info("filepath:" + pet.getPetImage().getOriginalFilename());

		String PATH = "C:/baezzi/goodee/works/java1/pet_project/src/main/resources/static/images/";

		if (!pet.getPetImage().getOriginalFilename().isEmpty()) {
			pet.getPetImage().transferTo(new File(PATH + pet.getPetImage().getOriginalFilename()));
		} 
		
		petService.petUpdate(new Pet(pet.getPetId(), pet.getPetName(), pet.getPetType(), pet.getPetAge(), pet.getPetSex(), pet.getPetBreed(), pet.getPetDiscription(), pet.getPetImage().getOriginalFilename(), pet.getOwnerId()));
		
		return "redirect:/myPet";

	}
	
	/*
	 * localhost:8383/myPetInsert
	 * 내 펫 정보 등록(mypage)
	 * (펫정보가 없을때)
	 */
	@RequestMapping(value = "/myPetInsert", method = RequestMethod.GET)
	public String myPetInsert() {
		log.info("mypetInsert");
		return "myPetInsert";
		
	}
	
	@RequestMapping(value = "/myPetInsertAction", method = RequestMethod.POST)
	public String myPetInsertAction( @RequestParam("ownerId") String ownerId, HttpServletRequest request, PetDto pet) throws IllegalStateException, IOException {
		
		HttpSession session = request.getSession();
		
		log.info("session.getAttribute(\"loginedMemberId\") : " + session.getAttribute("loginedMemberId"));
		log.info("pet.ownerId = " + pet.getOwnerId());
		log.info("ownerId222 = " + ownerId);
		log.info("myPetInsertAction");
		log.info("pet:" + pet);
		
		log.info("filepath:" + pet.getPetImage().getOriginalFilename());

		String PATH = "C:/baezzi/goodee/works/java1/pet_project/src/main/resources/static/images/";

		if (!pet.getPetImage().getOriginalFilename().isEmpty()) {
			pet.getPetImage().transferTo(new File(PATH + pet.getPetImage().getOriginalFilename()));
		}
		
		petService.petInsert(new Pet(pet.getPetId(), pet.getPetName(), pet.getPetType(), pet.getPetAge(), pet.getPetSex(), pet.getPetBreed(), pet.getPetDiscription(), pet.getPetImage().getOriginalFilename(), pet.getOwnerId() ));
		
		return "redirect:/myPet";

	}
	
	/*
	 * localhost:8383/myInfo
	 * 마이페이지-내 회원정보
	 * 
	 */
	@RequestMapping("/myInfo") 
	public String myInfo(HttpServletRequest request, Model model) {
		

		HttpSession session = request.getSession();

		Integer loginedMemberId = (Integer) session.getAttribute("loginedMemberId");
		
		log.info("sessionLoginId " + loginedMemberId);
		
		Member member = memberService.getMemberById(loginedMemberId);
		
		model.addAttribute("member",member);
		
		return "myInfo";
	}
	
	/*
	 * localhost:8383/myInfo
	 * 마이페이지-내 회원정보 수정
	 * 
	 */
	//////////////////수정////////////////
	@RequestMapping("/myInfoUpate")
	public String myInfoUpate(@RequestParam("memberId") String memberId, HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();

		Integer loginedMemberId = (Integer) session.getAttribute("loginedMemberId");
		
		log.info("sessionLoginId " + loginedMemberId);
		
		Member member = memberService.getMemberById(loginedMemberId);

		model.addAttribute("member", member);
		return "myInfoUpdate";
	}
	
	@RequestMapping(value = "/myInfoUpdateAction", method = RequestMethod.POST)
	public String postUpdateAction(HttpServletRequest request, MemberDto member) throws IllegalStateException, IOException {

		log.info("myInfoUpdateAction");
		log.info("memberDto:" + member);

/*		if (memberDto.getProductImage() == null) {
			log.info("등록한 이미지파일이 없음(필수등록)");
			return "myPostUpdate";
		}*/

		/*service.myInfoUpdate(new Shop(shop.getProductNumber(), shop.getProductName(), shop.getProductPrice(),
				shop.getProductDescription(), "baejiyoung", c.getTime(), shop.getProductImage().getOriginalFilename(),
				shop.getPetType(), shop.getProductCategory()));
				
*/
		Calendar c = Calendar.getInstance();
		
		memberService.myInfoUpdateByMemberId(new Member(member.getId(), member.getMemberId(),
														member.getMemberPw(), member.getMemberName(), member.getMemberNickname(),
														member.getMemberPhone(), member.getMemberAddress(), c.getTime()));
		return "redirect:/myInfo";

	}

}
