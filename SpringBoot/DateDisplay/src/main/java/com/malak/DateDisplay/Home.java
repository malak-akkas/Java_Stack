package com.malak.DateDisplay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class Home {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

@RequestMapping("/date")
public String dateDisplay(Model model) {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM yyyy");
		model.addAttribute("Date", format.format(d));
			
		return "Date.jsp";
	
}

	@RequestMapping("/time")
	public String timeDisplay(Model model) {
		Date t = new Date();
		SimpleDateFormat format = new SimpleDateFormat("hh:mm a");
		model.addAttribute("Time", format.format(t));
		
		return "Time.jsp";
	}
}
