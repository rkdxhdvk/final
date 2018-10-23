package com.jhta.test.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jhta.test.service.GongiService;
import com.jhta.test.vo.GongiVo;
import com.jhta.util.PageUtil;

@Controller
public class ListController {
	@Autowired private GongiService service;
	@RequestMapping("list")
	public ModelAndView list(@RequestParam(value="pageNum", defaultValue="1")int pageNum, 
			String field, String keyword) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("field", field);
		map.put("keyword", keyword);
		int totalRowCount = service.getCount(map);
		PageUtil pu = new PageUtil(pageNum, totalRowCount, 5, 5);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());
		List<GongiVo> list = service.list(map);
		
		ModelAndView mv = new ModelAndView("list");
		mv.addObject("field", field);
		mv.addObject("keyword", keyword);
		mv.addObject("list", list);
		mv.addObject("pu", pu);
		return mv;
	}
}
