package com.nagarro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.services.LoginServices;

@Controller
public class LoginController {

	@Autowired
	LoginServices service;

	public static String user;

	@RequestMapping("login")
	public ModelAndView login(@RequestParam("name") String userid, @RequestParam("pass") String pass) {
		ModelAndView mv = new ModelAndView();
		if (service.validateUser(userid, pass)) {
			mv.setViewName("home");
			user = userid;
			mv.addObject("name", userid);
			mv.addObject("list", service.getAll());
			return mv;
		}
		mv.setViewName("login");
		return mv;
	}
}
