package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Ressource {

	@RequestMapping
	public String hello()
	{
		return "hhhhhhhhhh";
	}
}
