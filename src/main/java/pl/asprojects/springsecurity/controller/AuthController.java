package pl.asprojects.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	@GetMapping("/") 
		public String home() {
			return ("<h1>Welcome</h1>");
		}
		
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome User</h1>");
	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");
	}

	@GetMapping("ch2")
	public String ch2() {
		return ("<h1>Welcome ch2</h1>");
	}
}
