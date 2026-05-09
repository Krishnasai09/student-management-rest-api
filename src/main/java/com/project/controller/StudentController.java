package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.entity.Student;
import com.project.exceptions.StudentIdNotFoundException;
import com.project.service.StudentService;

@RestController
public class StudentController {
		
		@Autowired
		private StudentService studentService;
		
		
		@GetMapping("/getDetails")
		public ResponseEntity<List<Student>> getDetails() {
			
			List<Student> student = studentService.getDetails();
			
			return ResponseEntity.ok(student);
			
		}
		
		
		@PostMapping("/registerStudent")
		public Student registerStudent(@RequestBody Student student) {
			
			return studentService.registerStudent(student);
			
		}
		
		
		@GetMapping("/getStudentById/{id}")
		public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
			
			Optional<Student> student = studentService.getStudentById(id);
			
			if(student.isEmpty()) {
				throw new StudentIdNotFoundException("Id Not Found");
			} else {
				return ResponseEntity.ok(student.get());
			}
			
		}
		
		
		@PutMapping("/updateStudent/{id}")
		public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
			
			Optional<Student> updatedStudent = studentService.updateStudent(id, student);
			
				return ResponseEntity.ok(updatedStudent.get());
			
		}
		
		
		@DeleteMapping("/deleteStudent/{id}")
		public ResponseEntity<Student> deleteStudent(@PathVariable Long id) {
			
			Boolean isDeleted = studentService.deleteStudent(id);
			
			if(isDeleted) {
				return ResponseEntity.ok().build();
			} else {
				throw new StudentIdNotFoundException("Student ID Not Found");
			}
			
		}
		
		
		@GetMapping("/ModelAndView")
		public ModelAndView viewWebPage() {
			
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("response", "This is the data from controller class to response.jsp");
			
			mav.setViewName("response");
			
			return mav;
			
		}
		
		
		@PutMapping("/newUpdateStudent/{id}")
		public ResponseEntity<Student> newUpdateStudent(@PathVariable Long id, @RequestBody Student student) {
			
			Optional<Student> newStudent = studentService.newUpdateStudent(id, student);
			
			if(newStudent.isPresent()) {
				return ResponseEntity.ok(newStudent.get());
			} else {
				throw new StudentIdNotFoundException("Student ID Not Found");
			}
		}
		
		

	}
