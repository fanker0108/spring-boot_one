package com.yh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lzntwo")
public class InterceptorTwoContrioller {
	
	@RequestMapping("findTwo")
	@ResponseBody
	public String  findOne() {
		
		
		return "two";
	}

}
