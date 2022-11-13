package com.auth.securiry;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "Hello!";
	}
	
	@PreAuthorize("hasRole('USER')")	
	@GetMapping("/user")
	public String user() {
		return "Hello User!";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin!";
	}
}
