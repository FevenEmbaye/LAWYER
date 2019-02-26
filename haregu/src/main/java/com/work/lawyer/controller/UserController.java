package com.work.lawyer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.work.lawyer.Entity.User;

@Controller
public class UserController {
	@RequestMapping(value = "register", method= RequestMethod.GET )
	public ModelAndView registrationForm(){
		ModelAndView model = new ModelAndView();
		model.setViewName("register");
		return model;
	}
	
	@RequestMapping(value = "registerRes", method= RequestMethod.POST )
	public ModelAndView registration(@ModelAttribute("user1") User user){
		
		ModelAndView model = new ModelAndView();
		System.out.println(user);
		model.addObject("userKey", user);
		model.setViewName("registrationResult");
		return model;
	}

}
