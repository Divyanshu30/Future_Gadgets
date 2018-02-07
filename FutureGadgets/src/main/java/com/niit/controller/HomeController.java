package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value= {"/", "/index"})
	public String homePage()
	{
		return "index";
	}
	@RequestMapping("/AboutUs")
	public String nextPage()
	{
		return "AboutUs";
		
	}
	@RequestMapping("/LogIn")
	public String Signin()
	{
		return "LogIn";
		
	}
	@RequestMapping("/SignUp")
	public String SignUp()
	{
		return "SignUp";
		
	}
	
}