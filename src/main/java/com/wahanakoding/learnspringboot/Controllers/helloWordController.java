package com.wahanakoding.learnspringboot.Controllers;

import com.wahanakoding.learnspringboot.Entity.UserName;
import org.springframework.web.bind.annotation.*;

/**
 * @author Hanif Amrullah
 * @since 26/08/2020 - 16:13
 */

@RestController
public class helloWordController {

	@GetMapping("/Helloworld")
	public String Helloworld() {
		return "Hello world!";
	}

	@GetMapping("/Helloworld/{name}")
	public String HelloworldName(@PathVariable(value="name") String name) {
		return "hello " + name;
	}

	@PostMapping("/Helloworld")
	public String PrintUsername(@RequestParam("userName") String userName) {
		return "hello " + userName;
	}

	@PostMapping("/HellowordUser")
	public UserName HelloworldUserPostcontroller(@RequestBody UserName userName) {
		return userName;
	}
}
