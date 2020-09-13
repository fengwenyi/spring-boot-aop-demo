package com.fengwenyi.springbootaopdemo.service.impl;

import com.fengwenyi.springbootaopdemo.service.ICacheService;
import org.springframework.stereotype.Service;

/**
 * @author Erwin Feng
 * @since 2020/9/13
 */
@Service
public class CacheServiceImpl implements ICacheService {
    @Override
    public Object get(String key, String cacheName) {
        return null;
    }

    @Override
    public void put(String key, Object result, String cacheName) {

    }
}
