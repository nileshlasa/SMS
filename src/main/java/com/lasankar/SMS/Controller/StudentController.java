package com.lasankar.SMS.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping(value = "/AddNewStudent")
	public String HandleAdStudent() {
		
		
		return "Hello";
	}

}

