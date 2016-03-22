package com.training.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.CarRental;

@Controller
public class ShowRequestController {
	
	@RequestMapping("/showAll")
	public String getAllRequests(Model model){
		
		List<CarRental> reqData = new ArrayList<CarRental>();
		
		reqData.add(new CarRental("sumit", 9874563214l, "dfv@bn.com", "jaguar"));
		reqData.add(new CarRental("sumit2", 9874563214l, "dfv@bn.com", "jaguar"));
		reqData.add(new CarRental("sumit3", 9874563214l, "dfv@bn.com", "jaguar"));
		reqData.add(new CarRental("sumit4", 9874563214l, "dfv@bn.com", "jaguar"));
		
		model.addAttribute("reqList", reqData);
		
		return "showAllRequest";
	}
	
	@RequestMapping(value = "/findRequest/{custName}", method = RequestMethod.GET)
	public String viewCustomerAddress(@PathVariable("custName") String custName, Model model){
		
		String msg = "21 Booking of "+custName;
		
		model.addAttribute("data", msg);
		
		throw new RuntimeException();
		
		//return "display";
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ModelAndView handleException(RuntimeException ex, HttpServletRequest req){
		ModelAndView mdl = new ModelAndView();
		
		
		mdl.addObject("msg", "Runtime Exception occured");
		mdl.addObject("url", req.getRequestURI());
		mdl.addObject("detail", ex.getStackTrace());
		mdl.setViewName("RunTimeHandler");
		return mdl;
	}

}
