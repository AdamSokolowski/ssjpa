package pl.asprojects.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	@GetMapping("/") 
		public String home() {
			return ("<h1>Welcome</h1><br><a href='/user'>User Page</a><br><a href='/admin'>Admin Page</a>");
		}
		
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome User</h1><br><a href='/admin'>Admin Page</a>");
	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Admin</h1><br><a href='/user'>User Page</a>");
	}

}
