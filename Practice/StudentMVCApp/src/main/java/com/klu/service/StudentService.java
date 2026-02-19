package com.klu.service;

import java.awt.List;

import com.klu.model.Student;

public interface StudentService {
	String getWelcomeMessage();
	String getStudentById(int id);
	List getAllStudents();
	Student updateStudent(int id,Student student);
	String deleteStudent(int id);
	String searchStudent(String name,String course);
	Student createStudent(Student student);
	String enrollStudent(int id,Student student);
	
}
