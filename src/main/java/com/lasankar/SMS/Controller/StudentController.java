package com.lasankar.SMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lasankar.SMS.Repository.Entity.Student;
import com.lasankar.SMS.Service.StudentDataImpl;

@Controller
public class StudentController {
	
	@Autowired
	StudentDataImpl studentdataservice;

	@RequestMapping(value = "/AddNewStudent")
	public String HandleAddStudent(@ModelAttribute("p") Student student)
	{
		
		studentdataservice.addStudent(student);	
		
		return "Hello";
	}

}

