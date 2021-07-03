package com.nagarro.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.model.Employee;
import com.nagarro.model.HRManager;

@Service
public class LoginServices {

	RestTemplate temp = new RestTemplate();

	public boolean validateUser(String userid, String pass) {
		// HRManager hr =
		// temp.getForObject("http://localhost:8081/management/login/nikhil",
		// HRManager.class);

		ResponseEntity<HRManager> en = temp.getForEntity("http://localhost:8081/management/login/" + userid,
				HRManager.class);
		HRManager hr = en.getBody();
		if (hr == null) {
			return false;
		}
		if (!hr.getPassword().equals(pass)) {
			return false;
		}
		return true;
	}

	public List<Employee> getAll() {
		/*
		 * ResponseEntity<Employee> en =
		 * temp.getForEntity("http://localhost:8081/management/home", Employee.class);
		 * List<Employee> list = new ArrayList<>(); while (en.hasBody()) {
		 * list.add(en.getBody()); }
		 */

		Employee[] el = temp.getForObject("http://localhost:8081/management/home", Employee[].class);
		List<Employee> list = Arrays.asList(el);
		return list;
	}

}
