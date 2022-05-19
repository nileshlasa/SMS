package com.lasankar.SMS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping(value="/ShowAll.html")
	public String HandleFindAllPage(Model model)
	{
		List<Student> a;
		
		
		a=studentdataservice.FindStudents();
		for(Student p : a)
		{
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getMobile());
			System.out.println(p.getEmail());
		}
		model.addAttribute("modules",a);
		return "ShowAll";
	}

}

