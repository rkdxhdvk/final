package com.jhta.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jhta.test.service.GongiService;
import com.jhta.test.vo.GongiVo;

@Controller
public class InsertController {
	@Autowired private GongiService service;
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insertForm() {
		return "insert";
	}
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insert(GongiVo vo) {
		int n = service.insert(vo);
		if(n>0) {
			return "redirect:/";
		}else {
			return "insert";
		}
	}
}
