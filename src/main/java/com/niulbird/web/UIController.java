package com.niulbird.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niulbird.web.command.ContactData;

@Controller
public class UIController extends BaseController {
	private static final Logger log = Logger.getLogger(UIController.class);

	private static final String HOME = "home";
	private static final String PAGE = "page";
	private static final String PAGE_NOT_FOUND = "page_not_found";
	
	
	@RequestMapping(value = "/index.html")
	public ModelAndView home() {
		return setView(HOME);
	}
	
	@RequestMapping(value = "/404.html")
	public ModelAndView pageNotFound() {
		return setView(PAGE_NOT_FOUND);
	}
	
	private ModelAndView setView(String pageName) {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName(pageName);
		mav.addObject(PAGE, pageName);
		mav.addObject("contactData", new ContactData());

		log.debug("Setting view: " + pageName);
		
		return mav;
	}
}
