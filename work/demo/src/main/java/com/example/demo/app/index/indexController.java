package com.example.demo.app.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class indexController {

	@GetMapping
	public String index(Model model) {
//	  model.addAttribute("title", "This is My p!!");
	  return "index";
	}

}
