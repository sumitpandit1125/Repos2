package com.training.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.CarRental;

@Controller
public class MainController{
	
	@Autowired
	ModelAndView mdl;
	
	@Autowired
	CarRental car;
	
	@RequestMapping("/")
	public String initApp(){
		return "index";
	}
	
	@RequestMapping(name = "/CarRequest", method = RequestMethod.GET)
	public ModelAndView initRequest(){
		mdl.setViewName("CarRequest");
		mdl.addObject("command",car);
		return mdl;
	}
	
	@RequestMapping(name = "/CarRequest", method = RequestMethod.POST)
	public String onSubmit(@Valid @ModelAttribute ("command") CarRental car, BindingResult result){
		
		
		String nextStep = "welcome";
		if(result.hasErrors()){
			nextStep = "CarRequest";
		}
		return nextStep;
	}
	
	@ModelAttribute("carType")
	public String[] type(){
		return new String[]{"Innova","Audi","BMW"};
		
	}
	
	@RequestMapping("cust/check")
	public String checkStatus(@RequestParam("name") String name, Model mdl){
		
		mdl.addAttribute("prevBooking", "Your previous booking found");
		
		return "welcome";
		
	}
	
}
