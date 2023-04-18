package com.qsp.thymeleafpractical1.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Mycontroller {
//	@RequestMapping(value = "/about",method = RequestMethod.GET)
//	public String about(Model model) {
//		System.out.println("inside about handler...");
//		model.addAttribute("name","Nitish kumar");
//		model.addAttribute("currentDate",new Date().toLocaleString());
//		
//		return "about";
//		
//		
//	}
//---------------------------------------------------------
	
	// handling iterator
	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {
		List<String> names = List.of("nitish","rahul","ram","manvendra");
		model.addAttribute("names",names);
		return "iterate";
	}
	
	@GetMapping("/condition")
	public String conditionhandler(Model m) {
		System.out.println("condition handler");
		m.addAttribute("isActive",true);
		m.addAttribute("gender", "m");
		List<Integer> list = List.of(12,45,67);
		m.addAttribute("mylist", list);
		
		return "condition";
	}
	
	@GetMapping("/service")
	public String serviceHandler(Model m) {
		m.addAttribute("title","i like cricket");
		m.addAttribute("subtitle",LocalDateTime.now().toString());
		return "service";
	}
	
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutnew";
	}
}
