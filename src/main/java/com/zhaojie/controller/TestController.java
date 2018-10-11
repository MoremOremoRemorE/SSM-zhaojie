package com.zhaojie.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhaojie.bean.Test;
import com.zhaojie.service.TestService;

@Controller
@RequestMapping("/user")
@Api(value = "/user", tags = "User接口")
public class TestController {
	@Autowired  
	TestService testservice;
     
	@RequestMapping(value = "show", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "根据id获取用户信息", notes = "根据id获取用户信息", httpMethod = "GET", response = Test.class)
	public Test showname(String id){	
		return testservice.showname(id);	
	}
}
