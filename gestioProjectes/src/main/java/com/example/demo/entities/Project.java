package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Project {
	
	/* - Values - */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idProject;

	private String name;
	private String stage;
	private String description;
	
	/* - Constructor - */
	public Project(String name, String stage, String description) {
		super();
		this.name = name;
		this.stage = stage;
		this.description = description;
	}
	public Project() {
		
	}
	
	/* - Getters & Setters - */
	public long getIdProject() {
		return idProject;
	}

	public void setIdProject(long idProject) {
		this.idProject = idProject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/* - To String - */
	@Override
	public String toString() {
		return "Project [idProject=" + idProject + ", name=" + name + ", stage=" + stage + ", description="
				+ description + "]";
	}
	
	
}