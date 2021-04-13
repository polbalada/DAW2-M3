package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Project;

@Controller
@RequestMapping("projects")
public class ProjectsController {
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		Project projecte=new Project();
		
		model.addAttribute("project",projecte);
		return "project-new";
	}
	
	@PostMapping("/add")
	public String createProject(Project project) {
		System.out.print(project);
		return "res";
		
	}
}
