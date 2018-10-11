package com.zhaojie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhaojie.bean.Test;
import com.zhaojie.dao.TestMapper;

@Service("TestService")
public class TestServiceImpl implements TestService {
	@Autowired
	private TestMapper testmapper;

	@Override
	public Test showname(String id) {
		// TODO Auto-generated method stub
		return testmapper.showname(id);
	}

}
