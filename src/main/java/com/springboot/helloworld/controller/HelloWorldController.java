package com.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping(method=RequestMethod.GET,value="/world")
	public String printHelloWorld()
	{
		return "HelloWorld!!!";
	}
}
