package com.guwc.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.guwc.springboot.mapper.UserMapper;
import com.guwc.springboot.entity.User;
import com.guwc.springboot.service.IUserService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends SuperServiceImpl<UserMapper, User> implements IUserService {


}