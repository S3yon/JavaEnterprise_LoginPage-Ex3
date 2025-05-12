package ca.sheridancollege.sriskans.controllers;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
		public String root() {
		return "root.html";
	}
	@GetMapping("/checking")
		public String check(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		System.out.println("Username: "+ username);
		System.out.println("Password: "+ password);
		if (username.equals("username") && password.equals("password")) {
			return "correct.html";
		}
		else
			return "Wrong.html";
		
	}
	@GetMapping("/checkingit")
	public String checkit(
	@RequestParam("name") String name,
	@RequestParam("studentid") String studentid,
	@RequestParam(value= "coop", defaultValue= "false") boolean coop,
	@RequestParam(value= "enroll", defaultValue= "false") boolean enroll,
	@RequestParam(value= "grades", defaultValue= "false") boolean grades,
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
		@RequestParam("date") LocalDate date,
	@DateTimeFormat(iso=DateTimeFormat.ISO.TIME)
		@RequestParam("time") LocalTime time) {
		
		System.out.println("Student name: " + name);
		System.out.println("Student ID: " + studentid);
		System.out.println("Coop?: " + coop);
		System.out.println("Enrollment?: " + enroll);
		System.out.println("grades: " + grades);
		return "correct.html";
	}
}
