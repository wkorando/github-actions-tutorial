package com.bk.githubactionstutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloController {

	public HelloController() {
	}

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}

	@GetMapping("/{name}")
	public String helloName(@PathVariable String name) {
		return String.format("Hello, %s!", name);
	}
}
