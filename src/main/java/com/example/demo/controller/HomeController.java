package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		//  form.htmlを呼び出す
		return "form";
	}
	
	//  POSTリクエストを受け付ける
	@PostMapping("/confirm") 
	public String confirm(@RequestParam String message, Model model) {
		//  変数 message に 引数 message の 値を格納
		model.addAttribute("message", message);
		// confirm.html を呼び出す
		return "confirm";
	}
}
