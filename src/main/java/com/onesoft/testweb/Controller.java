package com.onesoft.testweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value="/admin")
	public String getMsg() {
		return "Hello Docker";
	}

}
