package com.practice.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThymeDemoController {
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("about hander opened");
		model.addAttribute("name", "Satish Priyadarshi");
		return "about";
	}

}
