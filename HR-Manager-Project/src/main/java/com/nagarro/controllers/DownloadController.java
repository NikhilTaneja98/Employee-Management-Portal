package com.nagarro.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.model.Employee;
import com.nagarro.sheet.SheetDownloader;

@Controller
public class DownloadController {

	RestTemplate temp = new RestTemplate();

	@RequestMapping(value = "report", method = RequestMethod.GET)
	public ModelAndView getSheet() {
		Employee[] el = temp.getForObject("http://localhost:8081/management/home", Employee[].class);
		List<Employee> list = Arrays.asList(el);
		return new ModelAndView(new SheetDownloader(), "userList", list);
	}
}
