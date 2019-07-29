package com.team.medico.controller;


import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.medico.dtosym.Symptoms;

/**
 * Handles requests for the application home page.
 */

@RequestMapping(value="/hello")
public class HomeController {
	

	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/symptomSearch.htm")
	public String symptomList(ModelMap model) {
		//List<User> slist = userService.getAll();
		model.addAttribute("symptom", new Symptoms());
		return "symptom_search";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		
		
		model.addAttribute("serverTime", "yayy" );
		
		return "home";
	}
	
}
