package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

	@GetMapping("/app")
	public String app() {
		return "<form action=\"/usuari\">\r\n"
				+ "  <label for=\"fname\">First name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"fname\" value=\"John\"><br><br>\r\n"
				+ "  <input type=\"submit\" value=\"Submit\">\r\n"
				+ "</form>";
	}
	
	@GetMapping("/usuari")
	public String nouUsuari(String fname) {
		return "<h1>Holiiiiii " + fname + "</h1>";
	}
}
