package com.pandeys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

	@ResponseBody
	@RequestMapping("/makeup")
	public String giveCricketBat() {
		return "Hey...Here is your makeup kit.";
	}
	
	@ResponseBody
	@RequestMapping("/books")
	public String getBook() {
		return "Math Book";
	}
}
