package net.pere.gp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import net.pere.gp.dto.NomEstat;
import net.pere.gp.entities.Project;

@RepositoryRestResource(collectionResourceRel = "apiprojects", path="apiprojects")
public interface ProjectRepository extends JpaRepository<Project, Long>{
	
	@Override
	public List<Project> findAll();
	
	public List<Project> findByDescriptionContaining(String subcadena);
	
	@Query(nativeQuery = true, value = "SELECT NAME as nom, STAGE as estat FROM PROJECT")
	public List<NomEstat> findProjectesNomEstat();
	

}
