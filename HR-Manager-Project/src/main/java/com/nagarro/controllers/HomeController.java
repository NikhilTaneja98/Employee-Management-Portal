package com.nagarro.controllers;

import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.model.Employee;
import com.nagarro.services.HomeServices;
import com.nagarro.services.LoginServices;

@Controller
public class HomeController {

	@Autowired
	HomeServices service;

	@Autowired
	LoginServices loginserve;

	@RequestMapping("update")
	public ModelAndView edit(HttpServletRequest req, HttpServletResponse res) throws URISyntaxException {
		String code = req.getParameter("code");
		String name = req.getParameter("name");
		String loc = req.getParameter("loc");
		String email = req.getParameter("email");
		String date = req.getParameter("dateofbirth");
		Employee e = new Employee(Integer.parseInt(code), name, loc, email, date);
		System.out.println(req.getParameter("code"));
		service.addOrUpdate(e);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("list", loginserve.getAll());

		return mv;
	}

	@RequestMapping("add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) throws URISyntaxException {
		String code = req.getParameter("code");
		String name = req.getParameter("name");
		String loc = req.getParameter("loc");
		String email = req.getParameter("email");
		String date = req.getParameter("dateofbirth");
		Employee e = new Employee(Integer.parseInt(code), name, loc, email, date);
		System.out.println(req.getParameter("code"));
		service.addNew(e);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("list", loginserve.getAll());

		return mv;
	}
}
