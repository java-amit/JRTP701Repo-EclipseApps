package com.nt.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //(@Controller + @ResponseBody)
public class WishMessageOperationsController {
	private static Logger logger = LoggerFactory.getLogger(WishMessageOperationsController.class);  //private static because static variable can be use in static and non-static method
	
	@GetMapping("/greet")
	public ResponseEntity<String> showMessage(){
		logger.info("At the begning of the showMessage() method");
		String msg= "Good Morning";
		logger.info("At the end of the showMessage() method");
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
