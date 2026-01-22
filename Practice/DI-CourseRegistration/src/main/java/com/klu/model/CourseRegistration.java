package com.klu.model;

public class CourseRegistration {
	private int roolNo;
	private String StudentName;
	private String CourseName;
	private int semester;
	
	public CourseRegistration(int roolNo, String studentName) {
		this.roolNo = roolNo;
		this.StudentName = studentName;
	}

	public void setCourseName(String courseName) {
		this.CourseName = courseName;
		
	}
	public void setSemester(int semester) {
		this.semester = semester;
		
	}
	
	public void display() {
		System.out.println("RollNo:"+roolNo);
		System.out.println("Name:"+StudentName);
		System.out.println("CourseName"+CourseName);
		System.out.println("Semester"+semester);
	}
}