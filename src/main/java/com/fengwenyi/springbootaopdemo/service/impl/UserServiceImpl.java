package com.fengwenyi.springbootaopdemo.service.impl;

import com.fengwenyi.springbootaopdemo.annotation.LogExecutionTime;
import com.fengwenyi.springbootaopdemo.annotation.QueryData;
import com.fengwenyi.springbootaopdemo.entity.TUserEntity;
import com.fengwenyi.springbootaopdemo.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author Erwin Feng
 * @since 2020/9/13
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    @QueryData(key = "#id", cacheName = "USER", needLog = true)
    public TUserEntity queryById(String id) {
        return null;
    }
}
