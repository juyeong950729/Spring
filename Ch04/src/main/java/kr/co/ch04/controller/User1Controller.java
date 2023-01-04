package kr.co.ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class User1Controller {
	
	@GetMapping("/user1/register")
	public String register() {
		return "/user1/register";
	}
	
	@PostMapping("/user1/register")
	public String register(Model model, String name, int age) {
		
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "/user1/result";
	}

}
