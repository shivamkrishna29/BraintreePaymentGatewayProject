package com.project.braintree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BrainTreeController {

	@RequestMapping("/braintree")
	//@ResponseBody
	public String printHelloWorld() {
		return "braintree";
	}
}
