package com.nagarro.services;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.model.Employee;

@Service
public class HomeServices {

	RestTemplate temp = new RestTemplate();

	public void addNew(Employee e) throws URISyntaxException {
		/*
		 * System.out.println(e.getEmail());
		 * temp.delete("http://localhost:8081/management/login/" + e.getEmployeeCode());
		 * HttpHeaders head = new HttpHeaders();
		 * head.setContentType(MediaType.APPLICATION_JSON); HttpEntity<Employee>
		 * requestEntity = new HttpEntity<>(e, head); URI url = new
		 * URI("http://localhost:8081/management/login"); //
		 * System.out.println(requestEntity.getBody().getDateofbirth()); temp.put(url,
		 * e);
		 */
		// temp.delete("http://localhost:8081/management/login/" + e.getEmployeeCode());
		URI url = new URI("http://localhost:8081/management/login");
		System.out.println(e);
		temp.postForEntity(url, e, Employee.class);
	}

	public Employee find(int code) {
		ResponseEntity<Employee> en = temp.getForEntity("http://localhost:8081/management/edit/" + code,
				Employee.class);
		return en.getBody();

	}

	public void addOrUpdate(Employee e) throws URISyntaxException {
		temp.delete("http://localhost:8081/management/login/" + e.getEmployeeCode());
		URI url = new URI("http://localhost:8081/management/login");
		System.out.println(e);
		temp.postForEntity(url, e, Employee.class);
	}
}
