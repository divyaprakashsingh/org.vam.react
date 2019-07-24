package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Student;

@RepositoryRestResource
public interface StudentRepository extends CrudRepository<Student, Long>{
	
	
	List<Student>findByName(String name);
	List<Student>findByGender(String gender);
	List<Student>findBySubject(String subject);
	List<Student>findByNameAndSubject(String name, String subject);
	
	@Query("select s from Student s where s.name = ?1")
	List<Student> findByName1(@Param("name")String name);
}
