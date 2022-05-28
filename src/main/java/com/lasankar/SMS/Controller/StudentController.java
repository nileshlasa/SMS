package com.lasankar.SMS.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lasankar.SMS.Repository.Entity.Student;
import com.lasankar.SMS.Service.StudentDataImpl;

@Controller
public class StudentController {

	@Autowired
	StudentDataImpl studentdataservice;

	@RequestMapping(value = "/AddNewStudent")
	public String HandleAddStudent(@ModelAttribute("p") Student student,RedirectAttributes ra,Model model) {

		studentdataservice.addStudent(student);
		List<Student> a;

		a = studentdataservice.FindStudents();
		model.addAttribute("modules", a);
       ra.addFlashAttribute("message", "Student Added Successfully");
		return "redirect:/ShowAll";
	}
	
	
	
	@RequestMapping(value = "/ShowAll")
	public String HandleFindAllPage(Model model) {
		List<Student> a;

		a = studentdataservice.FindStudents();
		model.addAttribute("modules", a);
		return "ShowAll";
	}

	@RequestMapping(value = "/EditOneStudent")
	public String HandleEditRequest(@RequestParam Integer id, Model model,RedirectAttributes ra) {
		Optional<Student> StudentOptional = studentdataservice.findStudent(id);
		Student student1 = null;
		if (StudentOptional.isPresent()) {
			student1 = StudentOptional.get();
		} else {
			// call error page
		}
		/* model.addAttribute("student", student1); */
		ra.addFlashAttribute("student", student1);
         ra.addFlashAttribute("message", "Edit Student ID: "+id);
		return "redirect:/register.html";
	}
}
