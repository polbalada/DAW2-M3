package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControladorPrincipal {
	@GetMapping("/notes")
	public String notes() {
		return "index";
	}
	@GetMapping("/notes/{M}")
	public String notesM(@PathVariable(name="M") String M, 
			Model model) {
		model.addAttribute("m",M);
		return "NotesM";
	}
	@GetMapping("/notes/{M}/{UF}")
	public String notesMUF(@PathVariable(name="M") String M, @PathVariable(name="UF") String UF, 
			Model model) {
		model.addAttribute("m",M);
		model.addAttribute("uf",UF);
		return "NotesMUF";
	}
}
