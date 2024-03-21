package edu.wccnet.cooconnor.springMVC.controller;



import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.wccnet.cooconnor.springMVC.domain.Loan;



@Controller
public class MainController {
	
	
	
	@InitBinder
	public void initialBinderForTrimmingSpaces(WebDataBinder webDataBinder) {
	    StringTrimmerEditor stringTrimEditor = new StringTrimmerEditor(true);
	    webDataBinder.registerCustomEditor(String.class, stringTrimEditor);
	}
	
	@RequestMapping("/")
	public ModelAndView showForm() {
		return new ModelAndView("info-form","loan",new Loan());
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("loan") Loan loan, BindingResult result) {
		
		if(result.hasErrors()) {
			return "info-form";		
		}else {
			return "confirmation";
		}
	}
	
}
