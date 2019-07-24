package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Organization;
import com.example.demo.repositories.OrganizationRepository;

@RestController
public class OrganizationController {
	@Autowired
	private OrganizationRepository organizationRepository;

	@RequestMapping("/Test1")
	public String test() {
		return "Test";
	}

	@RequestMapping("/organizations")
	public Iterable<Organization> getOrganizations() {
		return organizationRepository.findAll();
	}

}
