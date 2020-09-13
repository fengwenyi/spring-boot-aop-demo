package com.fengwenyi.springbootaopdemo.service.impl;

import com.fengwenyi.springbootaopdemo.service.ILogService;
import org.springframework.stereotype.Service;

/**
 * @author Erwin Feng
 * @since 2020/9/13
 */
@Service
public class LogServiceImpl implements ILogService {
    @Override
    public void errorLog(String type, String className, String methodName, String errMsg) {

    }

    @Override
    public void infoLog(String type, String className, String methodName, String data) {

    }
}
