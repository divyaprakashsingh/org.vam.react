package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Organization {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long organizationID;
private String organizationname;
private String organizationdesc;

@OneToMany(cascade = CascadeType.ALL, mappedBy = "organization")
private List<Student> student;




public Organization() {
	super();
}

public Organization(String organizationname, String organizationdesc) {
	super();
	this.organizationname = organizationname;
	this.organizationdesc = organizationdesc;
}

public List<Student> getStudent() {
	return student;
}

public void setStudent(List<Student> student) {
	this.student = student;
}

public String getOrganizationname() {
	return organizationname;
}
public void setOrganizationname(String organizationname) {
	this.organizationname = organizationname;
}
public String getOrganizationdesc() {
	return organizationdesc;
}
public void setOrganizationesc(String organizationdesc) {
	this.organizationdesc = organizationdesc;
}
public long getOrganizationID() {
	return organizationID;
}
public void setOrganizationID(long organizationID) {
	this.organizationID = organizationID;
}


}
