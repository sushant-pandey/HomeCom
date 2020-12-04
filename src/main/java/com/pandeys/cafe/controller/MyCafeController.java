package com.pandeys.cafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {

	@RequestMapping("/cafe")
	public String showWelcomePage(HttpServletRequest request, Model model) {
		String myName = "Sushant";
		request.setAttribute("myName", myName);
		return "orderItem";
	}
	
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request, Model model) {
		String food_item = request.getParameter("food-item");
		String cust_name = request.getParameter("myName");
		model.addAttribute("foodItem", food_item);
		model.addAttribute("myName", "Sushant");
		return "orderProcessing";
	}
}
