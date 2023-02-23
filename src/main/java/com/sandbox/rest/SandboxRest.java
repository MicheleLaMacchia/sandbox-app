package com.sandbox.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SandboxRest {
	
	@RequestMapping(method = RequestMethod.GET)
	public String testServiceGet() {
		return "test controller";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String testServicePost(@RequestBody String string) {
		return "La stringa inserita è:"+string;
	}

}
