package com.kodz.michal.spring.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodz.michal.spring.web.dao.Offer;
import com.kodz.michal.spring.web.service.OffersService;

@Controller
public class OffersController {

	private OffersService offersService;

	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/offers")
	public String showOffers(Model model) {
		
//		offersService.throwTestException();

		List<Offer> offers = offersService.getCurrent();

		// model.addAttribute("name", "Kasia");
		model.addAttribute("offers", offers);

		return "offers";
	}

//	@ExceptionHandler(DataAccessException.class)
//	public String handleDatabaseException(DataAccessException ex){
//		return "error";
//	}
	
	@RequestMapping(value = "/testKurs", method = RequestMethod.GET)
	public String showTestKurs(Model model, @RequestParam("id") String id) {

		System.out.println("ID is: " + id);
		return "home";
	}

	@RequestMapping("/createoffer")
	public String createOffer(Model model) {

		model.addAttribute("offer", new Offer());
		return "createoffer";
	}

	@RequestMapping(value = "/docreate", method = RequestMethod.POST)
	public String doCreate(Model model, @Valid Offer offer, BindingResult result) {

		if (result.hasErrors()) {
			return "createoffer";
		} else {
			System.out.println("Form validated.");
		}
		
		offersService.create(offer);

		return "offercreated";
	}

	/*
	 * @RequestMapping("/") public ModelAndView showHome() { ModelAndView mv =
	 * new ModelAndView("home"); Map<String, Object> model = mv.getModel();
	 * 
	 * model.put("name", "Adam");
	 * 
	 * return mv; }
	 */
}
