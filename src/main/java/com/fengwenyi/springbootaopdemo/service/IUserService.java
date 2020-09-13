package com.fengwenyi.springbootaopdemo.service;

import com.fengwenyi.springbootaopdemo.entity.TUserEntity;

/**
 * @author Erwin Feng
 * @since 2020/9/13
 */
public interface IUserService {

    TUserEntity queryById(String id);

}
