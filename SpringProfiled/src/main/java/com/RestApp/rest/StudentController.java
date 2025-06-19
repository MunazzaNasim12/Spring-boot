package com.RestApp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.RestApp.model.Student;

@RestController
public class StudentController 
{
	@GetMapping("/stu-info")
	public ResponseEntity<Student>getStudentInfo(){
		Student stu=new Student(1,"Kishore","Chennai" ,34);
		return new ResponseEntity<Student>(stu, HttpStatus.OK);
	}
	
	public ResponseEntity<String>addStudentInfo(@RequestBody Student stu){
		String res="Student addded successfully ";
		System.out.println(stu);
		
		return new ResponseEntity<String>(res,HttpStatus.CREATED);
	}
	
}
