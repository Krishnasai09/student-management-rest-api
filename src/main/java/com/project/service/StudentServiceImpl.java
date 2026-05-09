package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Student;
import com.project.exceptions.InvalidUpdateStudentException;
import com.project.exceptions.RegisterStudentInvalidDataException;
import com.project.exceptions.StudentIdNotFoundException;
import com.project.repository.CrudOperations;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private CrudOperations repo;
	
	
	@Override
	public List<Student> getDetails() {
		
		List<Student> student = repo.findAll();
		
		if(student != null) {
			return student;
		} else {
			return null;
		}
		
	}
	
	@Override
	public Student registerStudent(Student student) {
		
		if(student == null) {
			throw new RegisterStudentInvalidDataException("Data cannot be empty");
		}
		
		if(student.getName() == null || student.getName().isEmpty()) {
			throw new RegisterStudentInvalidDataException("Name cannot be empty");
		}
		
		if(student.getMobile() == null || student.getMobile().isEmpty()) {
			throw new RegisterStudentInvalidDataException("Mobile number cannot be empty");
		}
		
		return repo.save(student);
		
	}
	
	
	@Override
	public Optional<Student> getStudentById(Long id) {
		
		if(id == null || id <= 0) {			
			throw new StudentIdNotFoundException("Invalid Input");
		} 
		return repo.findById(id);
		
	}
	
	
	@Override
	public Optional<Student> updateStudent(Long id, Student student) {
		
		if(id == null || id <=0) {
			throw new InvalidUpdateStudentException("Id cannot be empty");
		}
		
		Optional<Student> existingStudent = repo.findById(id);
		
		if(student == null) {
			throw new RegisterStudentInvalidDataException("Data cannot be empty");
		}
		
		if(student.getName() == null || student.getName().isEmpty()) {
			throw new RegisterStudentInvalidDataException("Name cannot be empty");
		}
		
		if(student.getMobile() == null || student.getMobile().isEmpty()) {
			throw new RegisterStudentInvalidDataException("Mobile number cannot be empty");
		}
		
		if(existingStudent.isEmpty()) {
			throw new InvalidUpdateStudentException("ID Not Found");
		} else {
			
			Student updateStudent = existingStudent.get();
			updateStudent.setName(student.getName());
			updateStudent.setMobile(student.getMobile());
			
			repo.save(updateStudent);
			return Optional.of(updateStudent);
		}
		
		
	}
	
	
	@Override
	public Boolean deleteStudent(Long id) {
		
		if(id !=null && id >= 0) {
			
			Optional<Student> existingStudent = repo.findById(id);
			
			if(existingStudent.isPresent()) {
				repo.delete(existingStudent.get());
				return true;
			} else {
				throw new StudentIdNotFoundException("Student ID Not Found");
			}
			
		} else {
			throw new StudentIdNotFoundException("Student ID Not Found");
		}
		
	}
	
	
	
	@Override
	public Optional<Student> newUpdateStudent(Long id, Student student) {
		
		if(id == null || id <= 0) {
			throw new StudentIdNotFoundException("ID cannot be empty");
		} 
		Optional<Student> existingStudent = repo.findById(id);
		
		if(existingStudent.isPresent()) {
			
			Student updateStudent = existingStudent.get();
			updateStudent.setName(student.getName());
			updateStudent.setMobile(student.getMobile());
			
			repo.save(updateStudent);
			
			return existingStudent;
			
		} else {
			throw new StudentIdNotFoundException("Student ID Not Found");
		}
		
	}
	
	
	

}
