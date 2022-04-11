package mdata.md.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import mdata.md.service.MAIN0010Service;

@Controller
public class MAIN0010Controller {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	MAIN0010Service main0010Service;
	
	@RequestMapping(value = "/MAIN0010", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView viewMAIN0010(@RequestParam(required = false) Map<String, Object> params) {
		
		logger.info("MAIN0010 START");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/MAIN0010");
		
		mv.addObject("INBOUND01", params);

		return mv;
	}
}