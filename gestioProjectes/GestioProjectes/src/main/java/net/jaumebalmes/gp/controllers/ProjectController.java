package net.jaumebalmes.gp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.jaumebalmes.gp.dao.ProjectsRepository;
import net.jaumebalmes.gp.entities.Project;

@Controller
@RequestMapping("/projects")   
//inici de path per a tots els controladors de la classe 
public class ProjectController {
	
	@Autowired
	ProjectsRepository proRep;
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		
		Project unProjecte = new Project();
		model.addAttribute("project", unProjecte);
		//passem a la plantilla un projecte que enllaçarem amb
		//cada camp del formulari th:field
		
		return "projects/new-project"; //nom de la plantilla html a templates
	}
	
	@PostMapping("/save")
	public String createProject(Project project,
			Model model) {
		
		//System.out.println(project); 
		//només declarant project com a paràmetre
		//spring injecte el l'objecte 
		
		proRep.save(project);
		
		return "redirect:/projects"; //nom de la plantilla html a templates
	}

	@GetMapping("")
	public String createProject(
			Model model) {
		
		List<Project> projects = proRep.findAll();
		model.addAttribute("projects", projects);
		
		return "projects/list-projects"; //nom de la plantilla html a templates
	}
	
	
	
}
