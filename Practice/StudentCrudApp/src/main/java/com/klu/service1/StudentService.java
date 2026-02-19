package com.klu.service1;


import com.klu.model.Student;
import java.util.List;
public interface StudentService {


  Student getStudentById(int id);
  Student createStudent(Student student);
  List<Student> getAllStudents();
  Student updateStudent(int id,Student student);
  String deleteStudent(int id);
  List<Student> searchStudent(String name, String course);
}