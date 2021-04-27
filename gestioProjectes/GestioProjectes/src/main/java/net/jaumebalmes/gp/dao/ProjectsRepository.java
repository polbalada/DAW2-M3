package net.jaumebalmes.gp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.gp.entities.Project;

public interface ProjectsRepository extends CrudRepository<Project, Long>{
	
	//findAll() retorna un Iterable<Project>
	//El sobreescrivim com a mètode abstracte per tal que Spring torni
	//una Llista de projectes
	//Spring permet, entre d'altres, generar consultes (queries) a la bd 
	//només amb els noms, sense necessitat de saber sql
	@Override
	public List<Project> findAll();

}
