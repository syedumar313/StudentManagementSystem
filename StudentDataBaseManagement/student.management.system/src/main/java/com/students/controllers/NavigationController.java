package com.students.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
	
	@GetMapping("/")
	public String index(Model model) {
	    model.addAttribute("currentPage", "index");
	    return "index";
	}
	
	@GetMapping("/registerPage")
	public String register(Model model) {
	    model.addAttribute("currentPage", "addStudent");
		return "addStudent";
	}
	@GetMapping("/searchPage")
	public String search(Model model) {
	    model.addAttribute("currentPage", "searchStudent");
		return "searchStudent";
	}
	@GetMapping("/updatePage")
	public String update(Model model) {
	    model.addAttribute("currentPage", "updateStudent");
		return "updateStudent";
	}
	@GetMapping("/deletePage")
	public String delete(Model model) {
	    model.addAttribute("currentPage", "deleteStudent");
		return "deleteStudent";
	}
}
