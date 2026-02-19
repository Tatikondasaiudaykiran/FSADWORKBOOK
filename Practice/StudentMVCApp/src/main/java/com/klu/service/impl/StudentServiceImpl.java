package com.klu.service.impl;

import org.springframework.stereotype.Service;

import com.klu.model.Student;
import com.klu.service.StudentService;

@Service
public abstract class StudentServiceImpl implements StudentService{
  @Override
    public String getWelcomeMessage() {
        return "Hello from Spring MVC Service Layer!";
    }
 @Override
 public Student createStudent(Student student) {
	 studentList.add(student);
	 return student;
 }
   @Override
    public String getStudentById(int id) {
        for(Student s:studentList) {
        	if(s.getId()==id) {
        		return s;
        	}
        }
        return null;
    }
   @Override 
   public List<Student> getAllStudents(){
	   return studentList;
   }
   @Override
   public Student updateStudent(int id,Student) {
	   for(int i=0;i<studenList.size();i++) {
		   if(StudentList.get(i).getId()==id) {
			   student.setId(id);
			   studentList.set(i,student);
			   return student;
		   }
	   }
	   return null;
   }
   @Override
   public String deleteStudent(int id) {
	   for(Student s:studentList) {
		   if(s.getId()==id) {
			   StudentList.remove(s);
			   return "Student record deleted";
		   }
	   }
	   return "no Student recrd found";
   }

    @Override
    public List<Student> searchStudent(String name ,String course){
    	List<Student> result=new ArrayList<>();
    	for(Student s:studentList) {
    		if(s.getName().equalsIgnoreCase(name) && s.getCourse()==course) {
    			result .add(s);
    		}
    	}
    	return null;
    }
    
    
    
    
    
    
    
    @Override
    public Student createStudent(Student student) {
        // Normally save to DB
        return student;
    }
    @Override
    public String enrollStudent(int id, Student student) {
        return "Student " + student.getName()
                + " enrolled successfully with ID " + id;
    }
}