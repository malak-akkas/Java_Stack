package com.malak.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {
	@RequestMapping("")
	public String home(HttpSession session) {
		Integer c = (Integer) session.getAttribute("count");
		if (c == null) {
			session.setAttribute("count", 0);
		}

		else {
			c++;
			session.setAttribute("count", c);
		}
		return "home.jsp";
	}

	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		session.getAttribute("count");
		return "counter.jsp";
	}

	@RequestMapping("/clear")
	public String clearSession(HttpSession session) {
		session.removeAttribute("count");
		return "redirect:/";
	}

}
