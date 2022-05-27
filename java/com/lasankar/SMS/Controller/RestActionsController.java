package com.lasankar.SMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lasankar.SMS.Service.StudentDataImpl;

@RestController
public class RestActionsController {

	@Autowired
	StudentDataImpl studentService;
	
	@PostMapping("/deleteRecord")
	public String DeleteStudent(@RequestParam int id)
	{
		System.out.print("reached");
		studentService.deleteStudent(id);
		return "deleted successfully";
	}

}
