package com.malak.Routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")

public class CodingController {
	@RequestMapping("")
	public String coding() {
		return "Hello Coding Dojo!";
	}

	@RequestMapping("/python")
	public String second() {
		return "Python/Django was awesome!";
	}

	@RequestMapping("/java")
	public String third() {
		return "Java/Spring is better!";
	}

}
