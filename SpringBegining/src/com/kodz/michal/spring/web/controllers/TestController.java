package com.kodz.michal.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String showTest() {
System.out.println("tak to dziala?");

		return "test";
	}
}
