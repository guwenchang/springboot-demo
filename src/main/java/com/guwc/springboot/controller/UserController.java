package com.guwc.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guwc.springboot.entity.User;
import com.guwc.springboot.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value="用户相关的接口")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/add")
	@ApiOperation(notes="添加用户",value="添加一个用户",httpMethod="POST")
	
	@ApiImplicitParams({
		@ApiImplicitParam(name="username",paramType="query",dataType="string"),
		@ApiImplicitParam(name="psw",paramType="query",dataType="string")
	})
	public String add(User user){
		return "hello "+userService.insert(user);
	}
	

	@RequestMapping("/all")
	@ApiOperation(notes="查询所有用户",value="查询所有有，目前只返回数量",httpMethod="GET")
	public String find(){
		return ""+userService.selectCount(null);
	}
}
