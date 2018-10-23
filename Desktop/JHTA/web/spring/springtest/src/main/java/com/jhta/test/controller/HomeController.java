package com.jhta.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jhta.test.service.GongiService;
import com.jhta.test.vo.GongiVo;

@Controller
public class HomeController {
	@Autowired private GongiService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		List<GongiVo> list = service.index();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("list", list);
		return mv;
	}
}
