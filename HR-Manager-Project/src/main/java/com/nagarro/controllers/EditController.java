package com.nagarro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.services.HomeServices;

@Controller
public class EditController {

	@Autowired
	HomeServices service;

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam("idtodel") int id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("emp", service.find(id));
		mv.setViewName("edit");
		return mv;
	}
}
