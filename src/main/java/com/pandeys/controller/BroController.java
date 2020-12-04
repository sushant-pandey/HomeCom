package com.pandeys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BroController {

	@RequestMapping("/cricketbat")
	public String giveCricketBat() {
		System.out.println("Call is coming here");
		return "cricketbatA";
	}
}
