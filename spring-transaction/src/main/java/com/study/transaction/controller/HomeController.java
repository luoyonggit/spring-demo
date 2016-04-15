package com.study.transaction.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import com.study.transaction.service.TestHelperService;
import com.study.transaction.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Resource
	private TestService testService;

	@Resource
	private TestHelperService testHelperService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		this.testService.excuteInTransaction();
		return "home";
	}

	@RequestMapping(value = "/update")
	@ResponseBody
	public String update(Long table1Id, Long table2Id){
		this.testHelperService.update(table1Id, table2Id);
		return "update";
	}

	@RequestMapping(value = "/delete")
	@ResponseBody
	public String delete(Long table1Id, Long table2Id){
		this.testHelperService.delete(table1Id, table2Id);
		return "delete";
	}


	@RequestMapping(value = "/add")
	@ResponseBody
	public String add(){
		this.testHelperService.add();
		return "add";
	}

}
