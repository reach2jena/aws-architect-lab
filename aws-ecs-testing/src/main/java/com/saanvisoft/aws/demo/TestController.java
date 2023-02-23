package com.saanvisoft.aws.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value = "/private/v1/getMsg", method= RequestMethod.GET)	
	public ResponseEntity<Object> getFoosWithHeader() {
	    return new ResponseEntity<Object>("HI Rakesh Jena",HttpStatus.OK);
	}

}
