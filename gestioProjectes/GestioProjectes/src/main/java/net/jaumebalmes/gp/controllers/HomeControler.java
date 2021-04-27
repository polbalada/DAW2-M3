package net.jaumebalmes.gp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import net.jaumebalmes.gp.dao.ProjectsRepository;

@Controller
//inici de path per a tots els controladors de la classe 
public class HomeControler {
	
	@Autowired
	ProjectsRepository proRep;
	
	@GetMapping("")
	public String home(Model model) {

		return "main/home"; 
	}
	
}
