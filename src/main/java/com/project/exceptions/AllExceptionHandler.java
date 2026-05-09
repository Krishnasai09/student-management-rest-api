package com.project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AllExceptionHandler {

	ExceptionInfo einfo = new ExceptionInfo();

	@ExceptionHandler(value = StudentIdNotFoundException.class)
	public ResponseEntity<ExceptionInfo> studentIdNotFound(StudentIdNotFoundException snfe){
		
		einfo.setMessage(snfe.getMessage());
		einfo.setCode("SINF0100");
		
		return new ResponseEntity<ExceptionInfo>(einfo, HttpStatus.NOT_FOUND);
		
	}
	
	
	@ExceptionHandler(value = RegisterStudentInvalidDataException.class)
	public ResponseEntity<ExceptionInfo> invalidRegisterStudentData(RegisterStudentInvalidDataException rsid){
		
		einfo.setMessage(rsid.getMessage());
		einfo.setCode("IRSD0100");
		
		return new ResponseEntity<ExceptionInfo>(einfo,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(value = InvalidUpdateStudentException.class)
	public ResponseEntity<ExceptionInfo> invalidUpdateStudentData(InvalidUpdateStudentException iuse){
		
		einfo.setMessage(iuse.getMessage());
		einfo.setCode("IUSD0100");
		
		return new ResponseEntity<ExceptionInfo>(einfo, HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	
	
}
