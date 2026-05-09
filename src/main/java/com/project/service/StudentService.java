package com.project.service;

import java.util.List;
import java.util.Optional;

import com.project.entity.Student;


public interface StudentService {
	
	public List<Student> getDetails();
	
	public Student registerStudent(Student student);
	
	public Optional<Student> getStudentById(Long id);
	
	public Optional<Student> updateStudent(Long id, Student student);
	
	public Boolean deleteStudent(Long id);
	
	public Optional<Student> newUpdateStudent(Long id, Student student);

}
