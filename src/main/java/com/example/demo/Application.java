package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.repositories.OrganizationRepository;
import com.example.demo.repositories.StudentRepository;

@SpringBootApplication
public class Application {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired 
	OrganizationRepository organizationRepository;
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.info("Hellow Spring");
	}

//command line runner used for storing data in DB before execution of main method
@Bean
CommandLineRunner runner() {
	return args ->{
		Organization organization1 = new Organization("Delhi University" ," Delhi University");	
		Organization organization2 = new Organization("Karnatak University" ," Karnatak University");
		
		organizationRepository.save(organization1);
		organizationRepository.save(organization2);
		
		studentRepository.save(new Student("Ravi", "Male", "Science", organization1 ));
		studentRepository.save(new Student("Reena", "Female", "Arts", organization2));
		studentRepository.save(new Student("Nik", "Male", "Science" , organization1));
		studentRepository.save(new Student("Suma", "Female", "Science" , organization2));
		
		
	
	};
	
	
	
}}