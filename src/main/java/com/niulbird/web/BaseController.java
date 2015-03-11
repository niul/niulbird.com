package com.niulbird.web;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public abstract class BaseController {
	
	// Property source
	@Resource(name = "messageSource")
	MessageSource messageSource;
}
