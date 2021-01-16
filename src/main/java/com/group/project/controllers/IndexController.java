package com.group.project.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/")
public class IndexController {
    
    
//            @RequestMapping("/")
//	public @ResponseBody String greeting() {
//		return "Hello, World";
//	}
	@RequestMapping("/")
	String home(ModelMap modal) {
		modal.addAttribute("title", "Index");
		modal.addAttribute("message", "Test");
		return "index";
	}
}
