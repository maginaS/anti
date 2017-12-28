package com.springapp.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.apache.log4j.Logger;

/**
 * http://localhost:8089/test1/hello.do
 */
@Controller
@RequestMapping("/test1")

public class HelloController {

	private  Logger logger =Logger.getLogger(this.getClass());
	@RequestMapping(value = "/hello.do",method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		logger.info("this a info test!");
		return "hello";
	}
}