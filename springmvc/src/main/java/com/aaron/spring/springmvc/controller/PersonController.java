package com.aaron.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aaron.spring.springmvc.dto.Person;
@Controller
public class PersonController {
	@RequestMapping("/person")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Person person = new Person();
		person.setId(55);
		person.setName("Aaron");
		person.setHobby("Basketball");
		modelAndView.addObject("person",person);
		return modelAndView;
	}
}
