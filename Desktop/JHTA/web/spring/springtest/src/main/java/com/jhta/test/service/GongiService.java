package com.jhta.test.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.test.dao.GongiDao;
import com.jhta.test.vo.GongiVo;

@Service
public class GongiService {
	@Autowired private GongiDao dao;
	
	public int insert(GongiVo vo) {
		return dao.insert(vo);
	}
	public int getCount(HashMap<String, Object> map) {
		return dao.getCount(map);
	}
	public List<GongiVo> list(HashMap<String, Object> map){
		return dao.list(map);
	}
	public List<GongiVo> index(){
		return dao.index();
	}
}
