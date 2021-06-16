package com.javateam.pet_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView ScheduleManagementRoot(Model model) throws Exception {
		ModelAndView mav = new ModelAndView("redirect:/index");

		return mav;
	}
}
