package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.Book;

@Controller
@RequestMapping("/bookEntry.htm")
public class BookController {

	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	private Book book;
	
	
	@ModelAttribute("subjectCode")
	public String[] subjects(){
		return new String[]{"computer","grammer","Physics"};
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initForm(){
		
		
		mdl.setViewName("AddBook");
		mdl.addObject("command",book);
		
		return mdl;
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView onSubmit(@ModelAttribute("bookObj") Book bk){
				mdl.setViewName("Success");
		
		
		return mdl;
	}
}
