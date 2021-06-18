package com.malak.human;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	
	@RequestMapping("")
	public String  humanHello() {
		return "Hello Human!";
	}

	
	@RequestMapping("{name}")
	public String  heyHuman (@PathVariable("name") String name) {
		
		return "Hello" +name +"!";
	}

	
}
