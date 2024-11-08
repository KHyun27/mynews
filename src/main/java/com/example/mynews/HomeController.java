package com.example.mynews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home")
	public String home(Model model) {
		// https://greed-yb.tistory.com/218
		return "home";
	}

}
