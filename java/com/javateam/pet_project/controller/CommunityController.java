package com.javateam.pet_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javateam.pet_project.entity.Pet;
import com.javateam.pet_project.entity.Shop;
import com.javateam.pet_project.service.PetService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller("CommunityController")
public class CommunityController {
	
	@Autowired
	PetService petService;

	/*
	 * localhost:8383/petShow
	 * 펫자랑 게시판
	 * 
	 */
	@RequestMapping("/petShow") 
	public String PetShow(Model model) {
		
		
		return "petShow";
	}

}
