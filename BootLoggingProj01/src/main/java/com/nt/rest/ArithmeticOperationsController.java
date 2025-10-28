package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ArithmeticOperationsController {

	@GetMapping("/div")
	public String div() {
		log.info("At begning of div() method");
		
		try {
			log.info("performing arithmatic operaion");
		float result = 100/0;
		log.info("Arithmetic operation completed sucessfully");
		return "result is::"+result;
		}
		catch (Exception e) {
			e.printStackTrace();
			log.error("Problem in Arithmetic operation::"+e.getMessage());
			return "problem:"+e.getMessage();
		}
	}
	
}
