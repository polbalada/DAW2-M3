package com.example.demo.controladors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controladorPrincipal {
	
	@GetMapping("/")
	public String welcome() {
		return "index";
	}
}
