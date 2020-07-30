package com.punia.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyAppController {
	
	@RequestMapping("/home")
	
	public String home() {
		
		System.out.println("This is home controller");
		
		//need to add tomcat jasper dependency in pom to show jsp file data
		return "home.jsp";
	}

}
