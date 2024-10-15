package com.study.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class domain {
	
	@RequestMapping("/")
    public String index() {
		return "index";
    }
	
	
}
