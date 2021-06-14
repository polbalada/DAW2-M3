package net.pere.gp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.pere.gp.dao.ProjectRepository;
import net.pere.gp.dto.NomEstat;
import net.pere.gp.entities.Project;

@Controller
@RequestMapping("projects")
public class ProjectsController {
	
	@Autowired
	ProjectRepository proRep;
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		Project projecte = new Project();
		
		model.addAttribute("project", projecte);
		
		List<Project> projectes = proRep.findByDescriptionContaining("Spring");
		model.addAttribute("projects", projectes);		
		System.out.println(projectes);	
		
		List<NomEstat> nomEstat = proRep.findProjectesNomEstat();
		for(NomEstat ne: nomEstat) {
			System.out.println(ne.getNom() + " " + ne.getEstat());
		}
		
		
		return "project-new";
	}
	
	@PostMapping("/add")
	public String createProject(Project project) {
		//guardar a bd
		
		System.out.println(project);
		
		proRep.save(project);
		
		
		return "redirect:new";
	}

}
