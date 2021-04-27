package net.jaumebalmes.gp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
	
	@Id //de javax.persistence
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//la Id es generarà de manera automàtica 
	private long project_id;
	
	private String name;
	
	private String stage; //NOTSTARTED, INPROGRESS, COMPLETED
	
	private String description;

	// No ha d'incloure la id, ja que l'assigna el sistema
	public Project(String name, String stage, String description) {
		super();
		this.name = name;
		this.stage = stage;
		this.description = description;
	}

	//sempre hi ha de ser en un POJO
	public Project() {
		
	}
	
	public long getIdProject() {
		return project_id;
	}

	public void setIdProject(long project_id) {
		this.project_id = project_id;
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

	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", name=" + name + ", stage=" + stage + ", description="
				+ description + "]";
	}
	
	
	
	
	

}
