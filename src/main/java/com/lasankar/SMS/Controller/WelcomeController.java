package com.lasankar.SMS.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lasankar.SMS.Repository.Entity.Student;

@Controller
public class WelcomeController {
	
	@RequestMapping(value={"/","/index.html"})
	public String HandleIndexPage()
	{
		return "index";
	}
	@RequestMapping(value="/blog.html")
	public String HandleBlogPage()
	{
		return "blog";
	}
	
	@RequestMapping(value="/about.html")
	public String HandleAboutPage()
	{
		return "about";
	}
	
	
	@RequestMapping(value="/services.html")
	public String HandleServicesPage()
	{
		return "services";
	}
	
	@RequestMapping(value="/portfolio.html")
	public String HandlePortfolioPage()
	{
		return "portfolio";
	}
	
	@RequestMapping(value="/team.html")
	public String HandleTeamPage()
	{
		return "team";
	}
	
	@RequestMapping(value="/pricing.html")
	public String HandlePricingPage()
	{
		return "pricing";
	}
	
	@RequestMapping(value="/contact.html")
	public String HandleContactPage()
	{
		return "contact";
	}
	
	@RequestMapping(value="/register.html")
	public String HandleRegisterPage(Model model)
	{
		try
		{
		if(model.getAttribute("student")==null)
		{
		Student student=new Student(); 
		model.addAttribute(student);
		}
		}
		catch(Exception ex)
		{
			
		}
		return "register";
	}
	
	
}
