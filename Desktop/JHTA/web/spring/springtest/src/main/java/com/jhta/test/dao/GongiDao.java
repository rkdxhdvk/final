package com.jhta.test.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.test.vo.GongiVo;

@Repository
public class GongiDao {
	@Autowired private SqlSession session;
	
	public int insert(GongiVo vo) {
		return session.insert("insert", vo);
	}
	public int getCount(HashMap<String, Object> map) {
		return session.selectOne("getCount", map);
	}
	public List<GongiVo> list(HashMap<String, Object> map) {
		return session.selectList("list", map);
	}
	public List<GongiVo> index() {
		return session.selectList("index");
	}
}
