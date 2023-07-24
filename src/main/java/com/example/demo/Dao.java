package com.example.demo;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<HashMap<String, 
	Object>> selectColumns(){
		List<HashMap<String, Object>> list = sqlSession.selectList("db.selectColumns");
		return list;
	}
	
	
}
