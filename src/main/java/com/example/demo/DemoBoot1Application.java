package com.example.demo;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoBoot1Application.class, args);
	}
	
	//private final Dao dao;
	
	@Autowired 
	private Dao dao;
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!",  name);
	}
	
	@RequestMapping("/columnList")
	public List<HashMap<String, Object>> columnList() {
		System.out.println("OK, this");
		List<HashMap<String, Object>> list = dao.selectColumns();
		System.out.println(list);
		return list;
	}
	
	
}
