package mdata.md.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mdata.md.service.MAIN0010Service;

@Controller
public class MAIN0010Controller {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	MAIN0010Service main0010Service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String MAIN0010() {
		logger.info("MAIN0010 START");
		return "helloHome";
	}
}